package com.example.retrofit;

import java.util.ArrayList;

public class Model {
    String page;
    String per_page;
    String total;
    String total_pages;
    ArrayList<data> data;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPer_page() {
        return per_page;
    }

    public void setPer_page(String per_page) {
        this.per_page = per_page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public ArrayList<Model.data> getData() {
        return data;
    }

    public void setData(ArrayList<Model.data> data) {
        this.data = data;
    }

    public class data {
        String id;
        String email;
        String frist_name;
        String last_name;
        String avatar;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFrist_name() {
            return frist_name;
        }

        public void setFrist_name(String frist_name) {
            this.frist_name = frist_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
