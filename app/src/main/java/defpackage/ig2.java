package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AudioEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements InterfaceC1641t4 {
    public final ie2 w;
    public final c2 x;

    @if0(c = "com.azefsw.audioconnect.server.audio.capture.effects.MicrophoneAudioEffectsApplier$applyUntilCancellation$2", f = "MicrophoneAudioEffectsApplier.kt", l = {47}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super List<? extends sd5>>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ AudioRecord D;

        /* JADX INFO: renamed from: ig2$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.audio.capture.effects.MicrophoneAudioEffectsApplier$applyUntilCancellation$2$2$1", f = "MicrophoneAudioEffectsApplier.kt", l = {38}, m = "invokeSuspend")
        public static final class C0143QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ me2 B;
            public final /* synthetic */ ig2 C;
            public final /* synthetic */ AudioRecord D;

            /* JADX INFO: renamed from: ig2$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.azefsw.audioconnect.server.audio.capture.effects.MicrophoneAudioEffectsApplier$applyUntilCancellation$2$2$1$1", f = "MicrophoneAudioEffectsApplier.kt", l = {39}, m = "invokeSuspend")
            public static final class C0144QnHx extends px4 implements x81<Boolean, z80<? super sd5>, Object> {
                public int A;
                public /* synthetic */ Object B;
                public final /* synthetic */ ig2 C;
                public final /* synthetic */ AudioRecord D;
                public final /* synthetic */ me2 E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0144QnHx(AudioRecord audioRecord, me2 me2Var, ig2 ig2Var, z80 z80Var) {
                    super(2, z80Var);
                    this.C = ig2Var;
                    this.D = audioRecord;
                    this.E = me2Var;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    C0144QnHx c0144QnHx = new C0144QnHx(this.D, this.E, this.C, z80Var);
                    c0144QnHx.B = obj;
                    return c0144QnHx;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) throws Throwable {
                    Object objP;
                    va0 va0Var = va0.COROUTINE_SUSPENDED;
                    int i = this.A;
                    if (i == 0) {
                        C0239D.H(obj);
                        boolean zBooleanValue = ((Boolean) this.B).booleanValue();
                        this.A = 1;
                        ig2 ig2Var = this.C;
                        ig2Var.getClass();
                        me2 me2Var = this.E;
                        AudioEffect audioEffectInvoke = me2Var.b.invoke(new Integer(this.D.getAudioSessionId()));
                        int i2 = me2Var.a;
                        if (audioEffectInvoke == null) {
                            a62.a.l("AudioEffect " + he2.a(i2) + " couldn't be created");
                            ig2Var.x.a(new hg2(me2Var));
                            objP = sd5.a;
                        } else if (zBooleanValue) {
                            xm xmVar = new xm(1, ps0.L(this));
                            xmVar.r();
                            if (audioEffectInvoke.getEnabled()) {
                                a62 a62Var = a62.a;
                            } else {
                                a62 a62Var2 = a62.a;
                                int enabled = audioEffectInvoke.setEnabled(true);
                                if (enabled != 0) {
                                    a62Var2.a("Failed to apply " + he2.a(i2) + " (" + enabled + ")");
                                }
                            }
                            xmVar.B(new fg2(audioEffectInvoke, i2));
                            objP = xmVar.p();
                            if (objP != va0Var) {
                                objP = sd5.a;
                            }
                            if (objP != va0Var) {
                                objP = sd5.a;
                            }
                        } else {
                            if (audioEffectInvoke.getEnabled()) {
                                a62 a62Var3 = a62.a;
                                int enabled2 = audioEffectInvoke.setEnabled(false);
                                if (enabled2 != 0) {
                                    a62Var3.a("Failed to disable " + he2.a(i2) + " (" + enabled2 + ")");
                                }
                            } else {
                                a62 a62Var4 = a62.a;
                            }
                            audioEffectInvoke.release();
                            objP = sd5.a;
                        }
                        if (objP == va0Var) {
                            return va0Var;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return sd5.a;
                }

                @Override // defpackage.x81
                public final Object invoke(Boolean bool, z80<? super sd5> z80Var) {
                    return ((C0144QnHx) a(bool, z80Var)).i(sd5.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143QnHx(AudioRecord audioRecord, me2 me2Var, ig2 ig2Var, z80 z80Var) {
                super(2, z80Var);
                this.B = me2Var;
                this.C = ig2Var;
                this.D = audioRecord;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0143QnHx(this.D, this.B, this.C, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    me2 me2Var = this.B;
                    am amVarB = iE.b(me2Var.d.a(null));
                    C0144QnHx c0144QnHx = new C0144QnHx(this.D, me2Var, this.C, null);
                    this.A = 1;
                    if (kd.e(amVarB, c0144QnHx, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((C0143QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(AudioRecord audioRecord, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.D = audioRecord;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = ig2.this.new QnHx(this.D, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var = (ua0) this.B;
                ig2 ig2Var = ig2.this;
                List<me2> listA = ig2Var.w.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    if (((me2) obj2).c) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fp1.D(ua0Var, null, new C0143QnHx(this.D, (me2) it.next(), ig2Var, null), 3));
                }
                this.A = 1;
                if (arrayList2.isEmpty()) {
                    obj = cs0.w;
                } else {
                    Object[] array = arrayList2.toArray(new ni0[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    obj = new kotlinx.coroutines.QnHx((ni0[]) array).a(this);
                }
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return obj;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super List<? extends sd5>> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public ig2(ie2 ie2Var) {
        this.w = ie2Var;
        gq0.QnHx qnHx = gq0.x;
        this.x = new c2(ps0.o0(5, kq0.MINUTES));
    }

    @Override // defpackage.InterfaceC1641t4
    public final Object b(AudioRecord audioRecord, z80<? super sd5> z80Var) {
        if (!(audioRecord.getAudioSource() == 7)) {
            return sd5.a;
        }
        Object objR = fp1.R(new QnHx(audioRecord, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }
}
