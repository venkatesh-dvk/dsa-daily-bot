CREATE TABLE users (

    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    name VARCHAR(100),

    chat_id BIGINT UNIQUE,

    phone VARCHAR(20),

    difficulty_pref VARCHAR(20),

    streak INT DEFAULT 0,

    active BOOLEAN DEFAULT TRUE,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);