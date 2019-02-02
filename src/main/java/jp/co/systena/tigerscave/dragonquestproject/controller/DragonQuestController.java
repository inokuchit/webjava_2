package jp.co.systena.tigerscave.dragonquestproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.systena.tigerscave.dragonquestproject.service.DragonQuestService;

@Controller // Viewあり。Viewを返却するアノテーション
public class DragonQuestController {

  @RequestMapping("/") // URLとのマッピング
  public String index() {
    // Viewに渡すデータを設定
	  DragonQuestService dqe = new DragonQuestService();

	  dqe.generate();
	  dqe.attack();

    // Viewのテンプレート名を返す
    return "/";
  }
}
