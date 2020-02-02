INSERT INTO `authority`(`name`, `id`) VALUES ('ROLE_ADMIN', 1);
INSERT INTO `authority`(`name`, `id`) VALUES ('ROLE_USER', 2);
INSERT INTO `user` (`id`, `username`, `password`, `date_created`) VALUES (1,'admin','$2a$10$/DrzEJD403PbxZ.99R0Ru.K125d9DzXQtEPw4U1rNU7SqIR0HGBxi','2020-02-02 12:14:54');
INSERT INTO `user` (`id`, `username`, `password`, `date_created`) VALUES (2,'user','$2a$10$jnyyPpILA62jptkJhuvyT.leOiOMRYu1n0jHcGOD3aKGte.mulRqS','2020-02-02 12:14:54');
INSERT INTO `user_authority`(`authority_id`, `user_id`) VALUES (1, 1);
INSERT INTO `user_authority`(`authority_id`, `user_id`) VALUES (2, 1);
INSERT INTO `user_authority`(`authority_id`, `user_id`) VALUES (2, 2);
