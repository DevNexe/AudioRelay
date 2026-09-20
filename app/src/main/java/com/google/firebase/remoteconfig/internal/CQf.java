package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf {
    public static final Date d = new Date(-1);
    public static final Date e = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();

    public static class QnHx {
        public final int a;
        public final Date b;

        public QnHx(int i, Date date) {
            this.a = i;
            this.b = date;
        }
    }

    public CQf(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final QnHx a() {
        QnHx qnHx;
        synchronized (this.c) {
            qnHx = new QnHx(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return qnHx;
    }

    public final void b(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
