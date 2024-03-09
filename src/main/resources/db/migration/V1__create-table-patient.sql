CREATE TABLE patient (
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    document VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    number VARCHAR(100) NOT NULL,
    complement VARCHAR(100),
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    zip_code INT NOT NULL,
    created_at DATE DEFAULT CURRENT_DATE NOT NULL,
    updated_at DATE,
    deleted_at DATE
);
