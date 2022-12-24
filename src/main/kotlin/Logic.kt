
import java.util.*

class Logic {

    var hasil = String()

    fun startGame(listener: SuitCallback) {
        println("---------------------------------------------")
        println(">>>>>>>>>>>>>GAME SUIT<<<<<<<<<<<<<<<<<<<<<<")
        println("============================================")
        println(" Tentukan pilihan Anda ! ")
        println(" Batu ")
        println(" Gunting ")
        println(" Kertas ")

        println("Masukkan Pilihan Pemain 1 : ")
        val playerOne = readLine()!!
        println("Masukkan Pilihan Pemain 2 : ")
        val playerTwo = readLine()!!
        println("RESULTS : ")


        if (playerOne.equals(playerTwo)) {
            hasil = "DRAW!"
        } else if (playerOne == "batu" && playerTwo == "gunting" || playerOne == "gunting" && playerTwo == "kertas" ||
            playerOne == "kertas" && playerTwo == "batu"
        ) {
            hasil = "Player One Wins! "
        } else if (playerTwo == "batu" && playerOne == "gunting" || playerTwo == "gunting" && playerOne == "kertas" ||
            playerTwo == "kertas" && playerOne == "batu"
        ) {
            hasil = "Player Two Wins!"
        } else {
            hasil = "Inputan salah! Please try again! "
        }
        listener.sendValue(hasil)
    }
}

interface SuitCallback {
    fun sendValue(hasil: String)
}