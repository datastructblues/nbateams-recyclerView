package com.datastructblues.nbateams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.datastructblues.nbateams.databinding.ActivityTeamBinding

class TeamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTeamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        var selectedTeam = intent.getSerializableExtra("team") as Team
        binding.teamText.text=selectedTeam.name
        binding.imageView.setImageResource(selectedTeam.image)

    }
}