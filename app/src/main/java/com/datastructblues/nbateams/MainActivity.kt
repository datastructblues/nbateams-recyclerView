package com.datastructblues.nbateams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.datastructblues.nbateams.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var teamList: ArrayList<Team>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTeamArrayList()

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val teamAdapter= TeamAdapter(teamList)
        binding.recyclerView.adapter=teamAdapter

    }
    fun setTeamArrayList() {
        teamList = ArrayList<Team>()
        val atlanta = Team("Atlanta Hawks", R.drawable.atlanta)
        val boston = Team("Boston Celtics", R.drawable.boston)
        val brooklyn = Team("Brooklyn Nets", R.drawable.brooklyn)
        val charlotte = Team("Charlotte Hornets", R.drawable.charlotte)
        val chicago = Team("Chicago Bulls", R.drawable.chicago)
        val cleveland = Team("Cleveland Cavaliers", R.drawable.cleveland)
        val dallas = Team("Dallas Mavericks", R.drawable.dallas)
        val denver = Team("Denver Nuggets", R.drawable.denver)
        val detroit = Team("Detroit Pistons", R.drawable.detroit)
        val goldenState = Team("Golden State Warriors", R.drawable.goldenstate)
        val houston = Team("Houston Rockets", R.drawable.houston)
        val indiana = Team("Indiana Pacers", R.drawable.indiana)
        val clippers = Team("Los Angeles Clippers", R.drawable.losangelesclippers)
        val lakers = Team("Los Angeles Lakers", R.drawable.losangeleslakers)
        val memphis = Team("Memphis Grizzlies", R.drawable.memphis)
        val miami = Team("Miami Heat", R.drawable.miami)
        val milwaukee = Team("Milwaukee Bucks", R.drawable.milwaukee)
        val minnesota = Team("Minnesota Timberwolves", R.drawable.minnesota)
        val newOrleans = Team("New Orleans Pelicans", R.drawable.neworleans)
        val newYork = Team("New York Knicks", R.drawable.newyork)
        val oklahomaCity = Team("Oklahoma City Thunder", R.drawable.oklahomacity)
        val orlando = Team("Orlando Magic", R.drawable.orlando)
        val philadelphia = Team("Philadelphia 76ers", R.drawable.philadelphia)
        val phoenix = Team("Phoenix Suns", R.drawable.phoenix)
        val portland = Team("Portland Trail Blazers", R.drawable.portland)
        val sacremento = Team("Sacremento Kings", R.drawable.sacremento)
        val sanantonio = Team("San Antonio Spurs", R.drawable.sanantonio)
        val toronto = Team("Toronto Raptors", R.drawable.toronto)
        val utah = Team("Utah Jazz", R.drawable.utah)
        val washington = Team("Washington Wizards", R.drawable.washington)



     // It's unefficient way to add data to your app. You should use API's next!

        teamList.add(atlanta);
        teamList.add(boston);
        teamList.add(brooklyn);
        teamList.add(charlotte);
        teamList.add(chicago);
        teamList.add(cleveland);
        teamList.add(dallas);
        teamList.add(denver);
        teamList.add(detroit);
        teamList.add(goldenState);
        teamList.add(houston);
        teamList.add(indiana);
        teamList.add(clippers);
        teamList.add(lakers);
        teamList.add(memphis);
        teamList.add(miami);
        teamList.add(milwaukee);
        teamList.add(minnesota);
        teamList.add(newOrleans);
        teamList.add(newYork);
        teamList.add(oklahomaCity);
        teamList.add(orlando);
        teamList.add(philadelphia);
        teamList.add(phoenix);
        teamList.add(portland);
        teamList.add(sacremento);
        teamList.add(sanantonio);
        teamList.add(toronto);
        teamList.add(utah);
        teamList.add(washington);
    }
}