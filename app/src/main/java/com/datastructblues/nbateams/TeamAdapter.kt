package com.datastructblues.nbateams

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.datastructblues.nbateams.databinding.RecyclerRowBinding


class TeamAdapter(val teamList:ArrayList<Team>):RecyclerView.Adapter<TeamAdapter.TeamHolder>() {


    class TeamHolder(val binding: RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TeamHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamHolder, position: Int) {
        holder.binding.recyclerTextView.text=teamList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TeamActivity::class.java)
            intent.putExtra("team",teamList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
      return teamList.size
    }

}