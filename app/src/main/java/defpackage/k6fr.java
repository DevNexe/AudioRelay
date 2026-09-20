package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k6fr implements mz0<jv2> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: k6fr$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.settings.ui.audiooutput.AudioOutputSettingsInputHandler$getOpenSLOptionsStream$$inlined$map$1$2", f = "AudioOutputSettingsInputHandler.kt", l = {224}, m = "emit")
        public static final class C0154QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0154QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var) {
            this.w = nz0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0154QnHx c0154QnHx;
            if (z80Var instanceof C0154QnHx) {
                c0154QnHx = (C0154QnHx) z80Var;
                int i = c0154QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0154QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0154QnHx = new C0154QnHx(z80Var);
                }
            } else {
                c0154QnHx = new C0154QnHx(z80Var);
            }
            Object obj2 = c0154QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0154QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                int iIntValue = ((Integer) obj).intValue();
                for (kv2 kv2Var : kv2.values()) {
                    if (iIntValue == kv2Var.w) {
                        jv2 jv2Var = new jv2(kv2Var);
                        c0154QnHx.A = 1;
                        if (this.w.f(jv2Var, c0154QnHx) == va0Var) {
                            return va0Var;
                        }
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj2);
            return sd5.a;
        }
    }

    public k6fr(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super jv2> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
