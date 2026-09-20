package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import com.azefsw.audioconnect.player.audio.output.audiotrack.AudioTrackWriteException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn1 implements vn1, px, qy4.QnHx, y14.QnHx, ze, a90 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ sn1(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    public final boolean a(bo1 bo1Var, int i, Bundle bundle) {
        View view = (View) this.x;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                bo1Var.a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) bo1Var.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription description = bo1Var.a.getDescription();
        bo1.F1 f1 = bo1Var.a;
        ClipData clipData = new ClipData(description, new ClipData.Item(f1.a()));
        d80.CQf qnHx = i2 >= 31 ? new d80.QnHx(clipData, 2) : new d80.F1(clipData, 2);
        qnHx.a(f1.c());
        qnHx.setExtras(bundle);
        return bi5.i(view, qnHx.build()) == null;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        y14 y14Var = (y14) this.x;
        Cursor cursor = (Cursor) obj;
        os0 os0Var = y14.B;
        y14Var.getClass();
        while (cursor.moveToNext()) {
            y14Var.f(cursor.getInt(0), l52.QnHx.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // defpackage.ze
    public final void b(xe xeVar) {
        sm smVar = (sm) this.x;
        synchronized (smVar) {
            if (smVar.b instanceof dl0) {
                smVar.c.add(xeVar);
            }
            smVar.b.b(xeVar);
        }
    }

    @Override // defpackage.px
    public final void d(uw.QnHx qnHx) {
        uy4 cQf;
        k1 k1Var = (k1) this.x;
        sAn san = k1Var.A;
        try {
            final fl3 fl3Var = new fl3();
            boolean z = true;
            fl3Var.w = true;
            bm0.m(qnHx, new av3(new um() { // from class: j1
                @Override // defpackage.um
                public final void cancel() {
                    fl3Var.w = false;
                }
            }));
            k1Var.b();
            ny1 ny1Var = k1Var.D;
            try {
                if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                    while (fl3Var.w) {
                        i74 i74Var = k1Var.y.c;
                        ck4 ck4VarPoll = i74Var.b.poll(50L, TimeUnit.MILLISECONDS);
                        if (ck4VarPoll != null) {
                            i74Var.a.addAndGet(-ck4VarPoll.b);
                        } else {
                            ck4VarPoll = null;
                        }
                        if (ck4VarPoll != null) {
                            if (z) {
                                k1Var.w.play();
                                k1Var.c(ck4VarPoll);
                                san.b = rz4.a(san.b, vz4.LPt8Fixed.a);
                                z = false;
                            } else {
                                k1Var.c(ck4VarPoll);
                            }
                        }
                    }
                    sd5 sd5Var = sd5.a;
                } else {
                    sd5 sd5Var2 = sd5.a;
                }
                ((AtomicInteger) ny1Var.w).addAndGet(-2);
            } catch (Throwable th) {
                ((AtomicInteger) ny1Var.w).addAndGet(-2);
                throw th;
            }
        } catch (InterruptedException unused) {
            a62 a62Var = a62.a;
        } catch (Throwable th2) {
            if (th2 instanceof AudioTrackWriteException) {
                AudioTrackWriteException audioTrackWriteException = th2;
                cQf = new TN6.CQf(audioTrackWriteException.w, audioTrackWriteException.x);
            } else {
                cQf = TN6.QnHx.b;
            }
            san.a(cQf, th2.getMessage());
            qnHx.c(th2);
        }
    }

    @Override // qy4.QnHx
    public final Object e() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 2:
                return Integer.valueOf(((mu0) obj).l());
            case 3:
                ((ne5) obj).i.b();
                return null;
            case 4:
                return ((fs) obj).c();
            default:
                ln5 ln5Var = (ln5) obj;
                Iterator<ua5> it = ln5Var.b.J().iterator();
                while (it.hasNext()) {
                    ln5Var.c.a(it.next(), 1);
                }
                return null;
        }
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        CountDownLatch countDownLatch = (CountDownLatch) this.x;
        ExecutorService executorService = tf5.a;
        countDownLatch.countDown();
        return null;
    }
}
