package com.cos.baseball.domain.web.dto;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.team.Team;

import lombok.Data;

@Data
public class TeamRegReqDto {
	
	//Team 등록할 때 입력해야 하는 정보: Team 이름.
	
	private String teamName;

	public Team toEntity() {
		return Team.builder()
				.teamName(teamName)
				.build();
	}

}
