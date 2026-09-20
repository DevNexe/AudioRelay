package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.azefsw.audioconnect.player.ui.service.PlayerService;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm3 implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nm3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.bluetooth.BluetoothHeadset] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Boolean] */
    @Override // defpackage.m70
    public final void accept(Object obj) {
        ic2 ic2VarInvoke;
        boolean z = false;
        switch (this.w) {
            case 0:
                return;
            case 1:
                h81 h81Var = (h81) this.x;
                jl3 jl3Var = (jl3) this.y;
                yb ybVar = (yb) obj;
                if (ybVar instanceof yb.QnHx) {
                    h81Var.invoke();
                    jl3Var.w = ((yb.QnHx) ybVar).a;
                    return;
                }
                return;
            case 2:
                n60 n60Var = (n60) this.x;
                e61 e61Var = (e61) this.y;
                s50 s50Var = (s50) obj;
                synchronized (n60Var) {
                    if (n60Var.i) {
                        s50Var.d = false;
                        m15 m15Var = s50Var.b;
                        m15Var.b = true;
                        m15Var.c.close();
                        hd5 hd5Var = s50Var.c;
                        hd5Var.b = true;
                        hd5Var.c.close();
                        return;
                    }
                    n60Var.k = s50Var;
                    n60Var.l.g(Optional.of(s50Var));
                    xn2 xn2Var = n60Var.d;
                    synchronized (xn2Var) {
                        xn2Var.c = 3;
                        xn2Var.c(e61Var, null);
                        sd5 sd5Var = sd5.a;
                    }
                    return;
                }
            case 3:
                final sx2 sx2Var = (sx2) this.x;
                final VQko vQko = (VQko) this.y;
                ((Optional) obj).ifPresent(new Consumer() { // from class: rx2
                    @Override // j$.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void p(Object obj2) {
                        double d;
                        double d2;
                        sx2 sx2Var2 = sx2Var;
                        VQko vQko2 = vQko;
                        s50 s50Var2 = (s50) obj2;
                        qx2 qx2Var = sx2Var2.c;
                        int i = vQko2.c().b;
                        if (!s50Var2.a.b.e) {
                            d = i;
                            d2 = 0.2d;
                        } else if (i <= 100) {
                            d = i;
                            d2 = 0.5d;
                        } else if (i <= 1000) {
                            d = i;
                            d2 = 0.75d;
                        } else {
                            d = i;
                            d2 = 0.9d;
                        }
                        qx2Var.b.a = (int) (d * d2);
                        sx2Var2.c.b.b = s50Var2.a.b.e;
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                return;
            case 4:
                jl3 jl3Var2 = (jl3) this.x;
                PlayerService playerService = (PlayerService) this.y;
                uy2 uy2Var = (uy2) obj;
                boolean z2 = PlayerService.A;
                w63 w63Var = (w63) uy2Var.w;
                mc2 mc2Var = (mc2) uy2Var.x;
                if (jl3Var2.w != 0 && !ur1.a(Boolean.valueOf(w63Var.e), jl3Var2.w) && !w63Var.e) {
                    z = true;
                }
                if (w63Var.e) {
                    ic2VarInvoke = playerService.w;
                    if (ic2VarInvoke == null) {
                        a62.a.c("Creating a media session");
                        ic2VarInvoke = playerService.x.f.invoke(playerService);
                        playerService.w = ic2VarInvoke;
                    }
                } else {
                    playerService.b();
                    ic2VarInvoke = null;
                }
                if (ic2VarInvoke != null) {
                    MediaSessionCompat mediaSessionCompat = ic2VarInvoke.b;
                    MediaSession mediaSession = mediaSessionCompat.a.a;
                    boolean z3 = mc2Var.b;
                    mediaSession.setActive(z3);
                    Iterator<MediaSessionCompat.YKK> it = mediaSessionCompat.b.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                    mediaSessionCompat.d(new PlaybackStateCompat(z3 ? 3 : 1, -1L, 0L, z3 ? 1.0f : 0.0f, 0L, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
                    mediaSessionCompat.c(ic2VarInvoke.a(mc2Var.a));
                }
                Notification notificationB = playerService.x.c.b(w63Var, ic2VarInvoke != null ? ic2VarInvoke.b.a.b : null);
                if (z) {
                    playerService.c(notificationB, w63Var.c);
                    playerService.c(notificationB, w63Var.c);
                } else {
                    playerService.c(notificationB, w63Var.c);
                }
                jl3Var2.w = Boolean.valueOf(w63Var.e);
                return;
            case 5:
                uc4 uc4Var = (uc4) this.x;
                df4.CQf cQf = new df4.CQf((vb4) this.y, zs.QnHx.a.c());
                uc4Var.e = cQf;
                uc4Var.b.a(cQf);
                return;
            default:
                c2 c2Var = (c2) this.x;
                c2 c2Var2 = (c2) this.y;
                Throwable th = (Throwable) obj;
                c2Var.a(new sb4(th));
                c2Var2.a(new tb4(th));
                return;
        }
    }
}
