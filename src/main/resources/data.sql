INSERT INTO public.users(
	id, email, name, password, surname)
	VALUES (1, 'batuhan@mail.com', 'Batuhan', 'sifre', 'Bozkurt')
	ON CONFLICT (id) DO NOTHING;

INSERT INTO public.user_list(
	id, description, name, user_id)
	VALUES (1, 'this is the default list', 'default', 1)
	ON CONFLICT (id) DO NOTHING;