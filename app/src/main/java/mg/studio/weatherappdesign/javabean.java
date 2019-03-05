package mg.studio.weatherappdesign;

import java.util.List;

public class javabean {
    /**
     * time : 2019-03-04 19:08:02
     * cityInfo : {"city":"重庆市","cityId":"101040100","parent":"重庆","updateTime":"18:34"}
     * date : 20190304
     * message : Success !
     * status : 200
     * data : {"shidu":"73%","pm25":40,"pm10":69,"quality":"良","wendu":"11","ganmao":"极少数敏感人群应减少户外活动","yesterday":{"date":"03","sunrise":"07:20","high":"高温 20.0℃","low":"低温 8.0℃","sunset":"18:54","aqi":59,"ymd":"2019-03-03","week":"星期日","fx":"无持续风向","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},"forecast":[{"date":"04","sunrise":"07:18","high":"高温 18.0℃","low":"低温 11.0℃","sunset":"18:55","aqi":60,"ymd":"2019-03-04","week":"星期一","fx":"西风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"05","sunrise":"07:17","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:55","aqi":46,"ymd":"2019-03-05","week":"星期二","fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"06","sunrise":"07:16","high":"高温 14.0℃","low":"低温 10.0℃","sunset":"18:56","aqi":38,"ymd":"2019-03-06","week":"星期三","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","sunrise":"07:15","high":"高温 14.0℃","low":"低温 10.0℃","sunset":"18:57","aqi":56,"ymd":"2019-03-07","week":"星期四","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"08","sunrise":"07:14","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:57","aqi":57,"ymd":"2019-03-08","week":"星期五","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"09","sunrise":"07:13","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:58","aqi":56,"ymd":"2019-03-09","week":"星期六","fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"10","sunrise":"07:12","high":"高温 17.0℃","low":"低温 10.0℃","sunset":"18:58","ymd":"2019-03-10","week":"星期日","fx":"无持续风向","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","sunrise":"07:11","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"18:59","ymd":"2019-03-11","week":"星期一","fx":"无持续风向","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"12","sunrise":"07:10","high":"高温 19.0℃","low":"低温 9.0℃","sunset":"19:00","ymd":"2019-03-12","week":"星期二","fx":"北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","sunrise":"07:08","high":"高温 20.0℃","low":"低温 9.0℃","sunset":"19:00","ymd":"2019-03-13","week":"星期三","fx":"北风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"14","sunrise":"07:07","high":"高温 15.0℃","low":"低温 9.0℃","sunset":"19:01","ymd":"2019-03-14","week":"星期四","fx":"北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"15","sunrise":"07:06","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"19:02","ymd":"2019-03-15","week":"星期五","fx":"东南风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"16","sunrise":"07:05","high":"高温 20.0℃","low":"低温 11.0℃","sunset":"19:02","ymd":"2019-03-16","week":"星期六","fx":"东北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"17","sunrise":"07:04","high":"高温 20.0℃","low":"低温 12.0℃","sunset":"19:03","ymd":"2019-03-17","week":"星期日","fx":"北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"18","sunrise":"07:03","high":"高温 19.0℃","low":"低温 13.0℃","sunset":"19:03","ymd":"2019-03-18","week":"星期一","fx":"北风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"}]}
     */

    private String time;
    private CityInfoBean cityInfo;
    private String date;
    private String message;
    private int status;
    private DataBean data;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CityInfoBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class CityInfoBean {
        /**
         * city : 重庆市
         * cityId : 101040100
         * parent : 重庆
         * updateTime : 18:34
         */

        private String city;
        private String cityId;
        private String parent;
        private String updateTime;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }

    public static class DataBean {
        /**
         * shidu : 73%
         * pm25 : 40.0
         * pm10 : 69.0
         * quality : 良
         * wendu : 11
         * ganmao : 极少数敏感人群应减少户外活动
         * yesterday : {"date":"03","sunrise":"07:20","high":"高温 20.0℃","low":"低温 8.0℃","sunset":"18:54","aqi":59,"ymd":"2019-03-03","week":"星期日","fx":"无持续风向","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}
         * forecast : [{"date":"04","sunrise":"07:18","high":"高温 18.0℃","low":"低温 11.0℃","sunset":"18:55","aqi":60,"ymd":"2019-03-04","week":"星期一","fx":"西风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"05","sunrise":"07:17","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:55","aqi":46,"ymd":"2019-03-05","week":"星期二","fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"06","sunrise":"07:16","high":"高温 14.0℃","low":"低温 10.0℃","sunset":"18:56","aqi":38,"ymd":"2019-03-06","week":"星期三","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","sunrise":"07:15","high":"高温 14.0℃","low":"低温 10.0℃","sunset":"18:57","aqi":56,"ymd":"2019-03-07","week":"星期四","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"08","sunrise":"07:14","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:57","aqi":57,"ymd":"2019-03-08","week":"星期五","fx":"无持续风向","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"09","sunrise":"07:13","high":"高温 13.0℃","low":"低温 10.0℃","sunset":"18:58","aqi":56,"ymd":"2019-03-09","week":"星期六","fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"10","sunrise":"07:12","high":"高温 17.0℃","low":"低温 10.0℃","sunset":"18:58","ymd":"2019-03-10","week":"星期日","fx":"无持续风向","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","sunrise":"07:11","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"18:59","ymd":"2019-03-11","week":"星期一","fx":"无持续风向","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"12","sunrise":"07:10","high":"高温 19.0℃","low":"低温 9.0℃","sunset":"19:00","ymd":"2019-03-12","week":"星期二","fx":"北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","sunrise":"07:08","high":"高温 20.0℃","low":"低温 9.0℃","sunset":"19:00","ymd":"2019-03-13","week":"星期三","fx":"北风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"14","sunrise":"07:07","high":"高温 15.0℃","low":"低温 9.0℃","sunset":"19:01","ymd":"2019-03-14","week":"星期四","fx":"北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"15","sunrise":"07:06","high":"高温 19.0℃","low":"低温 10.0℃","sunset":"19:02","ymd":"2019-03-15","week":"星期五","fx":"东南风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"16","sunrise":"07:05","high":"高温 20.0℃","low":"低温 11.0℃","sunset":"19:02","ymd":"2019-03-16","week":"星期六","fx":"东北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"17","sunrise":"07:04","high":"高温 20.0℃","low":"低温 12.0℃","sunset":"19:03","ymd":"2019-03-17","week":"星期日","fx":"北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"18","sunrise":"07:03","high":"高温 19.0℃","low":"低温 13.0℃","sunset":"19:03","ymd":"2019-03-18","week":"星期一","fx":"北风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 03
             * sunrise : 07:20
             * high : 高温 20.0℃
             * low : 低温 8.0℃
             * sunset : 18:54
             * aqi : 59.0
             * ymd : 2019-03-03
             * week : 星期日
             * fx : 无持续风向
             * fl : <3级
             * type : 晴
             * notice : 愿你拥有比阳光明媚的心情
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String ymd;
            private String week;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getYmd() {
                return ymd;
            }

            public void setYmd(String ymd) {
                this.ymd = ymd;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }

        public static class ForecastBean {
            /**
             * date : 04
             * sunrise : 07:18
             * high : 高温 18.0℃
             * low : 低温 11.0℃
             * sunset : 18:55
             * aqi : 60.0
             * ymd : 2019-03-04
             * week : 星期一
             * fx : 西风
             * fl : <3级
             * type : 小雨
             * notice : 雨虽小，注意保暖别感冒
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String ymd;
            private String week;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getYmd() {
                return ymd;
            }

            public void setYmd(String ymd) {
                this.ymd = ymd;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
