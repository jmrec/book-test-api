DROP TABLE IF EXISTS books;

CREATE TABLE books (
    id UUID PRIMARY KEY,
    author VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    "year" INTEGER NOT NULL
);


INSERT INTO books (id, author, title, description, "year") VALUES
('41a3ec96-20be-40d5-9adf-8f656523fab3', 'Eleanor Vance', 'The Echo of Silent Keys', 'A gripping thriller about a concert pianist who uncovers a decades-old family secret hidden within her grandfather''s last composition.', 2018),
('2836dd66-edd0-4e9e-96a1-1b01291f6ba8', 'Julian Sterling', 'Midnight at the Clockwork Cafe', 'A whimsical fantasy novel following an antique clock repairer who discovers a portal to a city where time stands still.', 2021),
('e154b0cc-d627-41b2-b1f4-c299c5a9d86e', 'Aisha Rahman', 'Beneath Crimson Skies', 'An epic historical fiction drama detailing the struggles and triumphs of three generations of women during the collapse of an empire.', 2015),
('a71ba9ce-ff10-48e3-bd56-7ba574b65dc7', 'Dr. Marcus Vance', 'Quantum Shadows', 'A hard sci-fi exploration into the ethics of neural linking and the sudden disappearance of the project''s lead scientist.', 2024),
('dce60d2c-eb65-490c-bc03-3000b1d15ec4', 'Sienna Brooks', 'The Last Cartographer', 'An adventure novel about an isolated explorer mapping the final uncharted islands of a rapidly changing world.', 2019),
('59174c0a-f6ec-42b0-a4d3-64d57de3b17a', 'Thomas Thorne', 'Whispers of the Redwood', 'A slow-burn atmospheric mystery centered around a small Pacific Northwest town grappling with unexplained woodland disappearances.', 2017),
('0aac204a-282d-4abd-943f-5f45cc2b089c', 'Chloe Zhang', 'Stardust & Neon', 'A cyberpunk romance tracking a rogue hacker and a high-profile corporate defector on the run through a neon-drenched metropolis.', 2023),
('c1820b9a-c24e-4473-a93f-3b8241781843', 'Mateo Rossi', 'The Chef''s Inheritance', 'A heartwarming contemporary fiction piece about a young man rebuilding his life by reviving his late grandmother''s Tuscan bistro.', 2020),
('c432e737-c06e-4c75-9df3-9e5f96ba1298', 'Sarah Jenkins', 'Chasing Tangents', 'A witty modern romantic comedy exploring the chaotic lives of two statistics professors who try to calculate the probability of true love.', 2022),
('041a117f-a4d2-4d5b-9c62-69e4efce28e4', 'Gideon Blackwood', 'The Iron Vanguard', 'The first installment of a gritty dark fantasy series focusing on a fallen knight forced to protect a child born with forbidden magic.', 2016);
