package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Build;
import com.azefsw.audioconnect.player.audio.output.audiotrack.AudioTrackWriteException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Bk {
    public final sAn A;
    public final m1 B;
    public volatile int C;
    public final ny1 D;
    public final AudioTrack w;
    public final t6r8 x;
    public final p0 y;
    public final pf4 z;

    public static final class CQf extends cx1 implements j81<n52, sd5> {
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(String str) {
            super(1);
            this.w = str;
        }

        @Override // defpackage.j81
        public final sd5 invoke(n52 n52Var) {
            n52 n52Var2 = n52Var;
            n52Var2.b("audio_output", "audio_track");
            n52Var2.b("error_code", this.w);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<Long> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Long invoke() {
            k1 k1Var = k1.this;
            Sb1 sb1 = k1Var.x.f;
            return Long.valueOf(((long) k1Var.w.getPlaybackHeadPosition()) * ((long) ((sb1.b / 8) * sb1.c)));
        }
    }

    public k1(AudioTrack audioTrack, t6r8 t6r8Var, p0 p0Var, pf4 pf4Var, sAn san, m1 m1Var) {
        this.w = audioTrack;
        this.x = t6r8Var;
        this.y = p0Var;
        this.z = pf4Var;
        this.A = san;
        this.B = m1Var;
        int i = t6r8Var.j.a;
        Sb1 sb1 = t6r8Var.f;
        int i2 = i / ((sb1.b / 8) * sb1.c);
        this.D = new ny1(5);
        m1Var.a = new QnHx();
    }

    @Override // defpackage.Bk
    public final lx H(c54 c54Var) {
        return qw.e(ps0.M(this.A.b(j54.b), new uw(new sn1(this, 1)).i(c54Var)));
    }

    public final void b() {
        if (this.x.i.b) {
            int audioSessionId = this.w.getAudioSessionId();
            pf4 pf4Var = this.z;
            pf4Var.getClass();
            a62.a.c("Starting session id " + audioSessionId);
            Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
            intent.putExtra("android.media.extra.AUDIO_SESSION", audioSessionId);
            Context context = pf4Var.w;
            intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
            context.sendBroadcast(intent);
        }
    }

    public final void c(ck4 ck4Var) {
        String str;
        qk qkVar = ck4Var.a;
        if (qkVar == null) {
            throw new IllegalStateException("bytes AND shorts are null".toString());
        }
        int iWrite = this.w.write(qkVar.a, qkVar.b, qkVar.c);
        if (iWrite > 0) {
            this.B.c += (long) iWrite;
        }
        if (iWrite >= 0) {
            return;
        }
        if (iWrite == -6) {
            str = "ERROR_DEAD_OBJECT";
        } else if (iWrite == -3) {
            str = "ERROR_INVALID_OPERATION";
        } else if (iWrite != -2) {
            str = iWrite != -1 ? "ERROR_UNKNOWN" : "ERROR";
        } else {
            str = "ERROR_BAD_VALUE";
        }
        throw new AudioTrackWriteException(iWrite, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z = this.x.i.b;
        AudioTrack audioTrack = this.w;
        if (z) {
            int audioSessionId = audioTrack.getAudioSessionId();
            pf4 pf4Var = this.z;
            pf4Var.getClass();
            a62.a.c("Closing session id " + audioSessionId);
            Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
            intent.putExtra("android.media.extra.AUDIO_SESSION", audioSessionId);
            Context context = pf4Var.w;
            intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
            context.sendBroadcast(intent);
        }
        this.D.k();
        audioTrack.release();
    }

    @Override // defpackage.Bk
    public final void k() {
        setVolume(0.0f);
    }

    @Override // defpackage.Bk
    public final d73.QnHx r() {
        d73.QnHx qnHx;
        long j;
        ny1 ny1Var = this.D;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                p0 p0Var = this.y;
                long j2 = p0Var.e;
                long jA = p0Var.b.a() + p0Var.d.a.get() + p0Var.c.a.get();
                long j3 = 0;
                p0Var.e = 0L;
                long jH = OW8.h(this.x.f, jA);
                long jH2 = OW8.h(this.x.f, j2);
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        int underrunCount = this.w.getUnderrunCount();
                        int i = underrunCount - this.C;
                        this.C = underrunCount;
                        j3 = i;
                    } catch (Throwable th) {
                        a62.a.l("getUnderrunCount failed: " + th.getMessage());
                        j = 0;
                    }
                }
                j = j3;
                qnHx = new d73.QnHx(jH, jA, jH2, j2, 0L, 0L, j);
            } else {
                qnHx = d73.QnHx.h;
            }
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
            return qnHx;
        } catch (Throwable th2) {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
            throw th2;
        }
    }

    @Override // defpackage.Bk
    public final void setVolume(float f) {
        Object qnHx;
        String str;
        ny1 ny1Var = this.D;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                try {
                    int volume = this.w.setVolume(f);
                    if (volume < 0) {
                        if (volume == -6) {
                            str = "ERROR_DEAD_OBJECT";
                        } else if (volume == -3) {
                            str = "ERROR_INVALID_OPERATION";
                        } else if (volume != -2) {
                            str = volume != -1 ? "ERROR_UNKNOWN" : "ERROR";
                        } else {
                            str = "ERROR_BAD_VALUE";
                        }
                        a62 a62Var = a62.a;
                        a62Var.l("Failed to change the volume ".concat(str));
                        a62Var.f("set_volume_failed", new CQf(str));
                    }
                    qnHx = sd5.a;
                } catch (Throwable th) {
                    qnHx = new fq3.QnHx(th);
                }
                Throwable thA = fq3.a(qnHx);
                if (thA != null) {
                    a62 a62Var2 = a62.a;
                    a62.a.d(thA, true);
                }
            } else {
                a62.a.c("Ignored the setVolume call as the AudioTrack is closed.");
                sd5 sd5Var = sd5.a;
            }
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        } catch (Throwable th2) {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
            throw th2;
        }
    }
}
