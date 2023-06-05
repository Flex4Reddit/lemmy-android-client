package dev.burgerdriven.lemmyandroidclient

object Fixtures {
  val LocalUser = """
    {
      "id": 123,
      "person_id": 123,
      "email": null,
      "show_nsfw": true,
      "theme": "browser",
      "default_sort_type": 0,
      "default_listing_type": 1,
      "interface_language": "browser",
      "show_avatars": true,
      "send_notifications_to_email": false,
      "validator_time": "2000-04-21T22:11:34.707622",
      "show_bot_accounts": true,
      "show_scores": true,
      "show_read_posts": true,
      "show_new_post_notifs": false,
      "email_verified": false,
      "accepted_application": true
    }
  """.trimIndent()
  
  val LocalSite = """
    {
      "id": 1,
      "site_id": 1,
      "site_setup": true,
      "enable_downvotes": true,
      "enable_nsfw": true,
      "community_creation_admin_only": false,
      "require_email_verification": false,
      "application_question": "To combat brigading, we have restricted user registration on this instance. Please write a short description containing:\n\n* Why you would like to join Lemmy.ml\n\n* What communities you would most like to participate in, and\n\n* How or why you chose the username you did.\n\nWe use these questions to screen for and discourage spammers and trolls. We will try our best to review your application as soon as possible.",
      "private_instance": false,
      "default_theme": "browser",
      "default_post_listing_type": "Local",
      "legal_information": null,
      "hide_modlog_mod_names": true,
      "application_email_admins": false,
      "slur_filter_regex": "(fag(g|got|tard)?\\b|cock\\s?sucker(s|ing)?|ni((g{2,}|q)+|[gq]{2,})[e3r]+(s|z)?|mudslime?s?|kikes?|\\bspi(c|k)s?\\b|\\bchinks?|gooks?|bitch(es|ing|y)?|whor(es?|ing)|\\btr(a|@)nn?(y|ies?)|\\b(b|re|r)tard(ed)?s?)",
      "actor_name_max_length": 20,
      "federation_enabled": true,
      "federation_debug": false,
      "federation_worker_count": 32,
      "captcha_enabled": false,
      "captcha_difficulty": "medium",
      "registration_mode": "requireapplication",
      "reports_email_admins": false,
      "published": "2019-04-20T18:53:54.608882",
      "updated": "2023-06-03T22:11:21.706697"
    }
  """.trimIndent()
}
