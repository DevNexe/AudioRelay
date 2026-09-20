package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest$Builder;
import android.media.AudioManager;
import android.os.Build;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class E97 implements c73 {
    public final Context a;
    public final cCWu b;
    public final o23 c;
    public final ry4 d = new ry4(new CQf());

    public static final class CQf extends cx1 implements h81<AudioManager> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final AudioManager invoke() {
            return (AudioManager) E97.this.a.getSystemService("audio");
        }
    }

    @if0(c = "com.azefsw.audioconnect.player.audio.audiofocus.AudioFocusHandler$start$1", f = "AudioFocusHandler.kt", l = {48, 51}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public jJpw A;
        public QnHx B;
        public int C;

        public F1(z80<? super F1> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return E97.this.new F1(z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:64:0x0104  */
        /* JADX WARN: Code duplicated, block: B:65:0x0108  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, va0] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v4, types: [E97$QnHx] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.media.AudioManager] */
        /* JADX WARN: Type inference failed for: r11v11, types: [android.media.AudioManager] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11, types: [jJpw] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v3, types: [android.media.AudioManager$OnAudioFocusChangeListener] */
        /* JADX WARN: Type inference failed for: r1v7, types: [android.media.AudioManager$OnAudioFocusChangeListener] */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            QnHx qnHx;
            AudioFocusRequest audioFocusRequest;
            ?? r1;
            final wp3 wp3VarInvoke;
            QnHx qnHxA;
            ?? r0 = va0.COROUTINE_SUSPENDED;
            ?? r2 = this.C;
            E97 e97 = E97.this;
            if (r2 != 0) {
                try {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        QnHx qnHx2 = this.B;
                        jJpw jjpw = this.A;
                        C0239D.H(obj);
                        throw new KotlinNothingValueException();
                    }
                    qnHx = this.B;
                    jJpw jjpw2 = this.A;
                    C0239D.H(obj);
                    r1 = jjpw2;
                } catch (Throwable th) {
                    th = th;
                    if (r0 != 0 && r0.b) {
                        a62.a.c("Abandoning audio focus…");
                        if (Build.VERSION.SDK_INT >= 26) {
                            audioFocusRequest = r0.a;
                            if (audioFocusRequest != null) {
                                ((AudioManager) e97.d.getValue()).abandonAudioFocusRequest(audioFocusRequest);
                            } else {
                                e97.getClass();
                            }
                        } else {
                            ((AudioManager) e97.d.getValue()).abandonAudioFocus(r2);
                        }
                    }
                    throw th;
                }
            } else {
                C0239D.H(obj);
                cCWu ccwu = e97.b;
                int iOrdinal = ccwu.a.a().ordinal();
                if (iOrdinal == 0) {
                    wp3VarInvoke = ccwu.b.invoke();
                } else if (iOrdinal == 1) {
                    wp3VarInvoke = ccwu.c.invoke();
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wp3VarInvoke = ccwu.d.invoke();
                }
                r2 = new AudioManager.OnAudioFocusChangeListener() { // from class: jJpw
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i) {
                        wp3VarInvoke.a(i);
                    }
                };
                if (wp3VarInvoke.d()) {
                    a62.a.c("Requesting audio focus…");
                    qnHxA = E97.a(e97, r2);
                    if (!qnHxA.b) {
                        wp3VarInvoke.b();
                    }
                } else {
                    qnHxA = null;
                }
                try {
                    if (!(wp3VarInvoke instanceof aq3)) {
                        this.A = r2;
                        this.B = qnHxA;
                        this.C = 2;
                        S12N.c(this);
                        return r0;
                    }
                    this.A = r2;
                    this.B = qnHxA;
                    this.C = 1;
                    qh0 qh0Var = rl0.a;
                    Object objD0 = fp1.D0(n72.a, new Tp(e97, wp3VarInvoke, null), this);
                    if (objD0 != r0) {
                        objD0 = sd5.a;
                    }
                    if (objD0 == r0) {
                        return r0;
                    }
                    qnHx = qnHxA;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = qnHxA;
                    if (r0 != 0) {
                        a62.a.c("Abandoning audio focus…");
                        if (Build.VERSION.SDK_INT >= 26) {
                            audioFocusRequest = r0.a;
                            if (audioFocusRequest != null) {
                                ((AudioManager) e97.d.getValue()).abandonAudioFocusRequest(audioFocusRequest);
                            } else {
                                e97.getClass();
                            }
                        } else {
                            ((AudioManager) e97.d.getValue()).abandonAudioFocus(r2);
                        }
                    }
                    throw th;
                }
            }
            if (qnHx != null && qnHx.b) {
                a62.a.c("Abandoning audio focus…");
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest2 = qnHx.a;
                    if (audioFocusRequest2 != null) {
                        r1 = r2;
                        ((AudioManager) e97.d.getValue()).abandonAudioFocusRequest(audioFocusRequest2);
                    } else {
                        r1 = r2;
                        e97.getClass();
                    }
                } else {
                    r1 = r2;
                    ((AudioManager) e97.d.getValue()).abandonAudioFocus(r1);
                }
            }
            r1 = r2;
            r1 = r2;
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx {
        public final AudioFocusRequest a;
        public final boolean b;

        public QnHx(int i, AudioFocusRequest audioFocusRequest) {
            this.a = audioFocusRequest;
            this.b = i == 1;
        }
    }

    public E97(Context context, cCWu ccwu, o23 o23Var) {
        this.a = context;
        this.b = ccwu;
        this.c = o23Var;
    }

    public static final QnHx a(E97 e97, jJpw jjpw) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return new QnHx(((AudioManager) e97.d.getValue()).requestAudioFocus(jjpw, 3, 1), null);
        }
        e97.getClass();
        if (i < 26) {
            throw new IllegalStateException("Don't call this on API < 26".toString());
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest$Builder(1).setOnAudioFocusChangeListener(jjpw).setAudioAttributes(new AudioAttributes.Builder().setContentType(0).setUsage(1).build()).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(true).build();
        return new QnHx(((AudioManager) e97.d.getValue()).requestAudioFocus(audioFocusRequestBuild), audioFocusRequestBuild);
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        return kd.x(new F1(null));
    }
}
