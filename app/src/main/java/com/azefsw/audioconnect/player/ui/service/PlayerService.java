package com.azefsw.audioconnect.player.ui.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.azefsw.audioconnect.R;
import defpackage.NFo7;
import defpackage.a62;
import defpackage.a73;
import defpackage.c54;
import defpackage.cl0;
import defpackage.cq4;
import defpackage.cs2;
import defpackage.cx1;
import defpackage.dn1;
import defpackage.fx;
import defpackage.h40;
import defpackage.h81;
import defpackage.hr2;
import defpackage.ic2;
import defpackage.j54;
import defpackage.j81;
import defpackage.jl3;
import defpackage.jr2;
import defpackage.ln2;
import defpackage.m91;
import defpackage.nm3;
import defpackage.r80;
import defpackage.ry4;
import defpackage.tn2;
import defpackage.tp2;
import defpackage.ts2;
import defpackage.ur1;
import defpackage.v63;
import defpackage.vq2;
import defpackage.w63;
import defpackage.wc3;
import defpackage.z0;
import defpackage.z63;
import defpackage.z73;
import defpackage.z81;
import defpackage.zouF;
import defpackage.zr2;
import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerService extends Service {
    public static boolean A;
    public volatile ic2 w;
    public final CQf x;
    public final ry4 y;
    public final h40 z;

    public static final class CQf {
        public final ln2 a;
        public final tp2 b;
        public final v63 c;
        public final cl0 d;
        public final cq4 e;
        public final j81<Context, ic2> f;

        public CQf(ln2 ln2Var, tp2 tp2Var, v63 v63Var, cl0 cl0Var, cq4 cq4Var, dn1.QnHx qnHx) {
            this.a = ln2Var;
            this.b = tp2Var;
            this.c = v63Var;
            this.d = cl0Var;
            this.e = cq4Var;
            this.f = qnHx;
        }
    }

    public static final class F1 extends cx1 implements h81<NotificationManager> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final NotificationManager invoke() {
            return (NotificationManager) r80.c(PlayerService.this, NotificationManager.class);
        }
    }

    public static final class QnHx {
        public static void a(Context context, String str) {
            if (PlayerService.A) {
                a62.a.e("start_already_pending");
                return;
            }
            PlayerService.A = true;
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent = new Intent(context, (Class<?>) PlayerService.class);
                intent.putExtra("extra_address", str);
                context.startForegroundService(intent);
            } else {
                Intent intent2 = new Intent(context, (Class<?>) PlayerService.class);
                intent2.putExtra("extra_address", str);
                context.startService(intent2);
            }
        }
    }

    public PlayerService() {
        zouF zouf = zouF.b;
        if (zouf == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        this.x = zouf.a.b();
        this.y = new ry4(new F1());
        this.z = new h40();
    }

    public final void a() {
        v63 v63Var = this.x.c;
        ic2 ic2Var = this.w;
        startForeground(42, v63Var.b(new w63(v63Var.a.getString(R.string.app_name), "", false, 0, false), ic2Var != null ? ic2Var.b.a.b : null));
    }

    public final void b() {
        ic2 ic2Var = this.w;
        if (ic2Var != null) {
            a62.a.c("Releasing the media session");
            MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = ic2Var.b.a;
            mediaSessionImplApi21.e = true;
            mediaSessionImplApi21.f.kill();
            int i = Build.VERSION.SDK_INT;
            MediaSession mediaSession = mediaSessionImplApi21.a;
            if (i == 27) {
                try {
                    Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(mediaSession);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            mediaSession.setCallback(null);
            mediaSession.release();
            this.w = null;
        }
    }

    public final void c(Notification notification, boolean z) {
        if (z) {
            startForeground(42, notification);
        } else {
            stopForeground(false);
            ((NotificationManager) this.y.getValue()).notify(42, notification);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ry4 ry4Var = this.y;
            if (((NotificationManager) ry4Var.getValue()).getNotificationChannel("PLAYER_CHANNEL") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("PLAYER_CHANNEL", getString(R.string.notification_channel_title), 2);
                notificationChannel.setShowBadge(false);
                ((NotificationManager) ry4Var.getValue()).createNotificationChannel(notificationChannel);
            }
        }
        a();
        jl3 jl3Var = new jl3();
        CQf cQf = this.x;
        final cl0 cl0Var = cQf.d;
        c54 c54Var = j54.b;
        vq2 vq2VarI = vq2.i(((wc3) cl0Var.b).h(c54Var), ((z73) cl0Var.c).a(c54Var), ((z63) cl0Var.d).b().a(c54Var), new z81() { // from class: x63
            @Override // defpackage.z81
            public final Object b(Object obj, Object obj2, Object obj3) {
                String string;
                int i;
                dd3 dd3Var = (dd3) obj;
                bl blVar = (bl) obj2;
                Boolean bool = (Boolean) obj3;
                String string2 = blVar.a;
                boolean z = string2.length() == 0;
                Object obj4 = cl0Var.a;
                if (z) {
                    string2 = blVar.b;
                    if (string2.length() == 0) {
                        string2 = ((Context) obj4).getString(R.string.app_name);
                    }
                }
                String str = string2;
                y73.CQf cQf2 = y73.CQf.b;
                y73 y73Var = blVar.c;
                if (ur1.a(y73Var, cQf2)) {
                    string = ((Context) obj4).getString(R.string.notification_ready_subtitle);
                } else if (y73Var instanceof y73.QnHx) {
                    string = ((Context) obj4).getString(R.string.notification_connecting_subtitle);
                } else if (y73Var instanceof y73.F1) {
                    string = ((Context) obj4).getString(R.string.notification_reconnecting_subtitle);
                } else if (y73Var instanceof y73.LPt8Fixed) {
                    string = ((Context) obj4).getString(R.string.notification_playing_subtitle);
                } else {
                    if (!(y73Var instanceof y73.NUlFixed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = ((Context) obj4).getString(R.string.notification_stopping_subtitle);
                }
                String str2 = string;
                boolean z2 = blVar.d;
                if (dd3Var.a()) {
                    i = blVar.d ? 1 : 2;
                } else {
                    i = 0;
                }
                return new w63(str, str2, z2, i, bool.booleanValue());
            }
        });
        vq2VarI.getClass();
        ts2 ts2Var = new ts2(new hr2(vq2VarI), new tn2(3));
        cq4 cq4Var = cQf.e;
        hr2 hr2VarA = ((z73) cq4Var.y).a(c54Var);
        NFo7 nFo7 = new NFo7(cq4Var, 17);
        hr2VarA.getClass();
        vq2 vq2VarK = vq2.k(ts2Var, new hr2(new cs2(hr2VarA, nFo7)), new a73());
        nm3 nm3Var = new nm3(4, jl3Var, this);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        vq2VarK.getClass();
        this.z.b(new zr2(new jr2(vq2VarK, nm3Var, byn, t23)).g());
        tp2 tp2Var = cQf.b;
        tp2Var.getClass();
        IntentFilter intentFilter = new IntentFilter("AUDIOCONNECT_PLAYER");
        tp2Var.a.registerReceiver((BroadcastReceiver) tp2Var.d.getValue(), intentFilter);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        stopForeground(false);
        this.z.a();
        tp2 tp2Var = this.x.b;
        tp2Var.a.unregisterReceiver((BroadcastReceiver) tp2Var.d.getValue());
        b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (intent == null) {
                throw new IllegalArgumentException("intent is null, did we change the return value of onStartCommand?".toString());
            }
            a();
            String stringExtra = intent.getStringExtra("extra_address");
            if (stringExtra == null) {
                throw new IllegalStateException("No address found".toString());
            }
            new fx(new z0(1, this, stringExtra)).i(j54.c).g();
            A = false;
            return 2;
        } catch (Throwable th) {
            A = false;
            throw th;
        }
    }
}
