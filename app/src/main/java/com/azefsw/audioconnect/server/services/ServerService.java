package com.azefsw.audioconnect.server.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.azefsw.audioconnect.R;
import defpackage.B8C;
import defpackage.J;
import defpackage.OW8;
import defpackage.S12N;
import defpackage.a62;
import defpackage.c54;
import defpackage.cs0;
import defpackage.cx1;
import defpackage.df4;
import defpackage.ef4;
import defpackage.g03;
import defpackage.h40;
import defpackage.h81;
import defpackage.ie4;
import defpackage.in2;
import defpackage.j54;
import defpackage.kf4;
import defpackage.ks;
import defpackage.m91;
import defpackage.no5;
import defpackage.r80;
import defpackage.rs2;
import defpackage.ry4;
import defpackage.ur1;
import defpackage.vq2;
import defpackage.wc3;
import defpackage.wu;
import defpackage.xp2;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ServerService extends Service {
    public static final /* synthetic */ int z = 0;
    public final QnHx w;
    public final ry4 x;
    public final h40 y;

    public static final class CQf extends cx1 implements h81<NotificationManager> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final NotificationManager invoke() {
            return (NotificationManager) r80.c(ServerService.this, NotificationManager.class);
        }
    }

    public static final class QnHx {
        public final ef4 a;
        public final in2 b;
        public final wc3 c;
        public final B8C d;
        public final g03 e;

        public QnHx(ef4 ef4Var, in2 in2Var, wc3 wc3Var, B8C b8c, g03 g03Var) {
            this.a = ef4Var;
            this.b = in2Var;
            this.c = wc3Var;
            this.d = b8c;
            this.e = g03Var;
        }
    }

    public ServerService() {
        ks ksVar = ks.c;
        if (ksVar == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        this.w = ksVar.a.a();
        this.x = new ry4(new CQf());
        this.y = new h40();
    }

    public final Notification a(kf4 kf4Var) {
        String string;
        String string2;
        xp2 xp2Var = new xp2(this, "SERVER_CHANNEL");
        xp2Var.c(2, OW8.r(kf4Var.a));
        xp2Var.p = 1;
        xp2Var.g = this.w.e.a();
        xp2Var.h = 1;
        xp2Var.s.icon = R.drawable.ic_notification_inverse;
        xp2Var.o = r80.b(this, R.color.blue_icon_background);
        df4 df4Var = kf4Var.a;
        if (OW8.r(df4Var)) {
            List<String> list = kf4Var.d;
            string = list.isEmpty() ^ true ? getString(R.string.server_service_server_active_notification_title, wu.M0(list, ", ", null, null, null, 62)) : getString(R.string.server_service_server_active_no_address_notification_title);
        } else {
            string = getString(R.string.server_service_server_inactive_no_address_notification_title);
        }
        if (ur1.a(df4Var, df4.QnHx.a)) {
            string2 = null;
        } else if (df4Var instanceof df4.CQf) {
            List<no5> list2 = kf4Var.c;
            int size = list2.size();
            if (size != 0) {
                string2 = size != 1 ? getString(R.string.server_service_clients_connected_notification_subtitle, Integer.valueOf(size)) : getString(R.string.server_service_client_connected_notification_subtitle, ((no5) wu.H0(list2)).b.y0());
            } else {
                string2 = getString(R.string.server_service_waiting_connections_notification_subtitle);
            }
        } else if (df4Var instanceof df4.F1) {
            string2 = getString(R.string.server_service_starting_notification_subtitle);
        } else {
            if (!(df4Var instanceof df4.LPt8Fixed)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(R.string.server_service_stopping_notification_subtitle);
        }
        xp2Var.e = xp2.b(string);
        xp2Var.f = xp2.b(string2);
        return xp2Var.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ry4 ry4Var = this.x;
            if (((NotificationManager) ry4Var.getValue()).getNotificationChannel("SERVER_CHANNEL") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("SERVER_CHANNEL", getString(R.string.notification_server_channel_title), 2);
                notificationChannel.setShowBadge(false);
                ((NotificationManager) ry4Var.getValue()).createNotificationChannel(notificationChannel);
            }
        }
        df4.QnHx qnHx = df4.QnHx.a;
        cs0 cs0Var = cs0.w;
        startForeground(43, a(new kf4(qnHx, false, cs0Var, cs0Var)));
        QnHx qnHx2 = this.w;
        ef4 ef4Var = qnHx2.a;
        c54 c54Var = j54.b;
        this.y.b(vq2.h(new rs2(ef4Var.b(c54Var)), qnHx2.c.h(c54Var), qnHx2.d.E0(c54Var).C(1000L, TimeUnit.MILLISECONDS), qnHx2.b.b(c54Var), new S12N()).y(new J(this, 13), m91.e, m91.c));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a62 a62Var = a62.a;
        stopForeground(false);
        this.y.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a62 a62Var = a62.a;
        synchronized (ie4.a) {
            try {
                df4.QnHx qnHx = df4.QnHx.a;
                cs0 cs0Var = cs0.w;
                startForeground(43, a(new kf4(qnHx, false, cs0Var, cs0Var)));
                ie4.b.invoke(Boolean.TRUE);
                ie4.b = null;
            } catch (Throwable th) {
                ie4.b = null;
                throw th;
            }
        }
        return 2;
    }
}
