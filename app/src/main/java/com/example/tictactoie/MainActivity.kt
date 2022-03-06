package com.example.tictactoie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResetGame.setOnClickListener(){
            resetGame()
        }
    }
    fun buttonCilick(view: View) {
        var id: Int = 0
        var buttonSelect = view as Button
        when (buttonSelect.id) {
            R.id.bt1 -> id = 1
            R.id.bt2 -> id = 2
            R.id.bt3 -> id = 3
            R.id.bt4 -> id = 4
            R.id.bt5 -> id = 5
            R.id.bt6 -> id = 6
            R.id.bt7 -> id = 7
            R.id.bt8 -> id = 8
            R.id.bt9 -> id = 9
        }
        startGame(id, buttonSelect)
        if (winer() == 1) {
            binding.editTextWinerShow.setText("player X is winer")
        } else if (winer() == 2) {
            binding.editTextWinerShow.setText("player 0 is winer")
        }
    }

    var palayerList1 = ArrayList<Int>()
    var palayerList2 = ArrayList<Int>()
    var activePlayer = 1
    fun startGame(id: Int, button: Button) {
        if (activePlayer == 1) {
            button.setText("X")
            palayerList1.add(id)
            activePlayer = 2
        } else {
            button.setText("O")
            palayerList2.add(id)
            activePlayer = 1
        }
        button.isEnabled = false
    }
    fun winer():Int{
        var winer :Int=0
        if (palayerList1.contains(1)&& palayerList1.contains(2)&&palayerList1.contains(3)) {
            winer= 1
        }else if(palayerList1.contains(4)&& palayerList1.contains(5)&&palayerList1.contains(6)){
            winer= 1
        }else if (palayerList1.contains(7)&& palayerList1.contains(8)&&palayerList1.contains(9)){
            winer= 1
        }else if (palayerList1.contains(1)&& palayerList1.contains(4)&&palayerList1.contains(7)){
            winer= 1
        }else if (palayerList1.contains(2)&& palayerList1.contains(5)&&palayerList1.contains(8)){
            winer= 1
        }else if (palayerList1.contains(3)&& palayerList1.contains(6)&&palayerList1.contains(9)){
            winer= 1
        }else if (palayerList1.contains(1)&& palayerList1.contains(5)&&palayerList1.contains(9)){
            winer= 1
        }else if (palayerList1.contains(3)&& palayerList1.contains(5)&&palayerList1.contains(7)){
            winer= 1
        }
        if (palayerList2.contains(1)&& palayerList2.contains(2)&&palayerList2.contains(3)) {
            winer= 2
        }else if(palayerList2.contains(4)&& palayerList2.contains(5)&&palayerList2.contains(6)){
            winer= 2
        }else if (palayerList2.contains(7)&& palayerList2.contains(8)&&palayerList2.contains(9)){
            winer= 2
        }else if (palayerList2.contains(1)&& palayerList2.contains(4)&&palayerList2.contains(7)){
            winer= 2
        }else if (palayerList2.contains(2)&& palayerList2.contains(5)&&palayerList2.contains(8)){
            winer= 2
        }else if (palayerList2.contains(3)&& palayerList2.contains(6)&&palayerList2.contains(9)){
            winer= 2
        }else if (palayerList2.contains(1)&& palayerList2.contains(5)&&palayerList2.contains(9)){
            winer= 2
        }else if (palayerList2.contains(3)&& palayerList2.contains(5)&&palayerList2.contains(7)){
            winer= 2
        }
        return winer
    }
    fun resetGame(){
        binding.bt1.setText("")
        binding.bt1.isEnabled=true
        binding.bt2.setText("")
        binding.bt2.isEnabled=true
        binding.bt3.setText("")
        binding.bt3.isEnabled=true
        binding.bt4.setText("")
        binding.bt4.isEnabled=true
        binding.bt5.setText("")
        binding.bt5.isEnabled=true
        binding.bt6.setText("")
        binding.bt6.isEnabled=true
        binding.bt7.setText("")
        binding.bt7.isEnabled=true
        binding.bt8.setText("")
        binding.bt8.isEnabled=true
        binding.bt9.setText("")
        binding.bt9.isEnabled=true
        activePlayer=1
        palayerList1.clear()
        palayerList2.clear()
    }
}