-- password - test123
insert into user_table (user_name, first_name, last_name, password_enc, role) values
('ironman', 'Tony', 'Stark', '$2a$10$Rk1bJqJxCiHSgRagMx0zMeVjDZV9EKAgrneE3TLgvchF5YIrrIqCS', 'USER'),
('msd', 'MS', 'Dhoni', '$2a$10$Rk1bJqJxCiHSgRagMx0zMeVjDZV9EKAgrneE3TLgvchF5YIrrIqCS', 'USER');

insert into about_table (content) values
('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis nec turpis mauris. Maecenas gravida molestie urna, ac molestie ante suscipit ac.'),
(' Praesent vestibulum massa orci, ac placerat ante aliquam a. Cras consequat maximus semper.'),
(' Nunc dictum posuere risus, egestas pellentesque ex tristique non. Vestibulum egestas laoreet lectus, at volutpat massa mattis nec.'),
(' Curabitur varius non sapien at finibus. Cras nec est eu eros sodales pulvinar. Proin eget gravida libero. Quisque lectus ante, gravida id ipsum eget, dictum semper massa. '),
('Duis accumsan tellus at lobortis molestie. Aliquam accumsan imperdiet magna, et auctor orci facilisis id. Duis molestie fermentum nisl id laoreet. Sed elementum nisl vitae vulputate congue.');

insert into slide_table (image) values
('https://images.unsplash.com/photo-1503428593586-e225b39bddfe?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'),
('https://images.unsplash.com/photo-1568043210943-0e8aac4b9734?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'),
('https://images.unsplash.com/photo-1477346611705-65d1883cee1e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'),
('https://images.unsplash.com/photo-1531415074968-036ba1b575da?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1047&q=80'),
('https://images.unsplash.com/photo-1570018144715-43110363d70a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=930&q=80'),
('https://images.unsplash.com/photo-1531692333527-0df5b708e9cf?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1074&q=80');

insert into event_table (event_name, event_desc, location, event_date) values
('Event 1', 'Test event number 1', 'Chennai', '2021-04-12'),
('Event 2', 'Test event number 2', 'Bangalore', '2021-04-14'),
('Event 3', 'Test event number 3', 'Mumbai', '2021-04-16');