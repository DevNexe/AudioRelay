package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import defpackage.C0239D;
import defpackage.al3;
import defpackage.bh2;
import defpackage.d32;
import defpackage.dy1;
import defpackage.fp1;
import defpackage.if0;
import defpackage.jl3;
import defpackage.js4;
import defpackage.ms1;
import defpackage.nz0;
import defpackage.px4;
import defpackage.qr4;
import defpackage.sd5;
import defpackage.ua0;
import defpackage.uk3;
import defpackage.va0;
import defpackage.wm5;
import defpackage.x81;
import defpackage.xz2;
import defpackage.yg2;
import defpackage.z80;
import defpackage.zk3;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public interface pm5 {
    public static final QnHx a = QnHx.a;

    public static final class QnHx {
        public static final /* synthetic */ QnHx a = new QnHx();

        /* JADX INFO: renamed from: pm5$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0182QnHx implements pm5 {
            public static final C0182QnHx b = new C0182QnHx();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [la0] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v6, types: [la0] */
            /* JADX WARN: Type inference failed for: r1v9, types: [T, bh2] */
            @Override // defpackage.pm5
            public final uk3 a(final View view) {
                la0 la0Var;
                xz2 xz2Var;
                ?? bh2Var;
                LinkedHashMap linkedHashMap = wm5.a;
                la0 la0Var2 = xr0.w;
                yg2.QnHx qnHx = yg2.QnHx.w;
                ry4 ry4Var = FO.I;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    la0Var = (la0) FO.I.getValue();
                } else {
                    la0Var = FO.J.get();
                    if (la0Var == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                la0 la0VarG0 = la0Var.g0(la0Var2);
                yg2 yg2Var = (yg2) la0VarG0.j(qnHx);
                if (yg2Var != null) {
                    xz2Var = new xz2(yg2Var);
                    dy1 dy1Var = xz2Var.x;
                    synchronized (dy1Var.a) {
                        dy1Var.d = false;
                        sd5 sd5Var = sd5.a;
                    }
                } else {
                    xz2Var = null;
                }
                final jl3 jl3Var = new jl3();
                ah2 ah2Var = (ah2) la0VarG0.j(ah2.QnHx.w);
                ?? r1 = ah2Var;
                if (ah2Var == null) {
                    bh2Var = new bh2();
                    jl3Var.w = bh2Var;
                }
                if (xz2Var != null) {
                    r1 = bh2Var;
                    la0Var2 = xz2Var;
                }
                r1 = bh2Var;
                la0 la0VarG1 = la0VarG0.g0(la0Var2).g0(r1);
                final uk3 uk3Var = new uk3(la0VarG1);
                final w80 w80VarJ = fp1.j(la0VarG1);
                d32 d32VarI = XTd3.i(view);
                YKK ykkC = d32VarI != null ? d32VarI.c() : null;
                if (ykkC == null) {
                    throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
                }
                view.addOnAttachStateChangeListener(new tm5(view, uk3Var));
                final xz2 xz2Var2 = xz2Var;
                ykkC.a(new auxFixed() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                    @if0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
                    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                        public int A;
                        public /* synthetic */ Object B;
                        public final /* synthetic */ jl3<bh2> C;
                        public final /* synthetic */ uk3 D;
                        public final /* synthetic */ d32 E;
                        public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 F;
                        public final /* synthetic */ View G;

                        @if0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {386}, m = "invokeSuspend")
                        public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                            public int A;
                            public final /* synthetic */ js4<Float> B;
                            public final /* synthetic */ bh2 C;

                            /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$CQf$QnHx$QnHx, reason: collision with other inner class name */
                            public static final class C0020QnHx implements nz0<Float> {
                                public final /* synthetic */ bh2 w;

                                public C0020QnHx(bh2 bh2Var) {
                                    this.w = bh2Var;
                                }

                                @Override // defpackage.nz0
                                public final Object f(Float f, z80 z80Var) {
                                    this.w.w.setValue(Float.valueOf(f.floatValue()));
                                    return sd5.a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public QnHx(js4<Float> js4Var, bh2 bh2Var, z80<? super QnHx> z80Var) {
                                super(2, z80Var);
                                this.B = js4Var;
                                this.C = bh2Var;
                            }

                            @Override // defpackage.m8
                            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                                return new QnHx(this.B, this.C, z80Var);
                            }

                            @Override // defpackage.m8
                            public final Object i(Object obj) throws Throwable {
                                va0 va0Var = va0.COROUTINE_SUSPENDED;
                                int i = this.A;
                                if (i == 0) {
                                    C0239D.H(obj);
                                    C0020QnHx c0020QnHx = new C0020QnHx(this.C);
                                    this.A = 1;
                                    if (this.B.a(c0020QnHx, this) == va0Var) {
                                        return va0Var;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    C0239D.H(obj);
                                }
                                throw new KotlinNothingValueException();
                            }

                            @Override // defpackage.x81
                            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) throws Throwable {
                                ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
                                return va0.COROUTINE_SUSPENDED;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public CQf(jl3<bh2> jl3Var, uk3 uk3Var, d32 d32Var, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, z80<? super CQf> z80Var) {
                            super(2, z80Var);
                            this.C = jl3Var;
                            this.D = uk3Var;
                            this.E = d32Var;
                            this.F = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                            this.G = view;
                        }

                        @Override // defpackage.m8
                        public final z80<sd5> a(Object obj, z80<?> z80Var) {
                            CQf cQf = new CQf(this.C, this.D, this.E, this.F, this.G, z80Var);
                            cQf.B = obj;
                            return cQf;
                        }

                        /* JADX WARN: Code duplicated, block: B:31:0x0094  */
                        /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
                        @Override // defpackage.m8
                        public final Object i(Object obj) throws Throwable {
                            ms1 ms1Var;
                            qr4 qr4VarK0;
                            Object obj2 = va0.COROUTINE_SUSPENDED;
                            int i = this.A;
                            WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 = this.F;
                            d32 d32Var = this.E;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ms1Var = (ms1) this.B;
                                try {
                                    C0239D.H(obj);
                                    if (ms1Var != null) {
                                        ms1Var.m(null);
                                    }
                                    d32Var.c().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                                    return sd5.a;
                                } catch (Throwable th) {
                                    th = th;
                                    if (ms1Var != null) {
                                        ms1Var.m(null);
                                    }
                                    d32Var.c().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                                    throw th;
                                }
                            }
                            C0239D.H(obj);
                            ua0 ua0Var = (ua0) this.B;
                            try {
                                bh2 bh2Var = this.C.w;
                                if (bh2Var != null) {
                                    js4 js4VarA = wm5.a(this.G.getContext().getApplicationContext());
                                    bh2Var.w.setValue(Float.valueOf(((Number) js4VarA.getValue()).floatValue()));
                                    qr4VarK0 = fp1.k0(ua0Var, null, 0, new QnHx(js4VarA, bh2Var, null), 3);
                                } else {
                                    qr4VarK0 = null;
                                }
                                try {
                                    uk3 uk3Var = this.D;
                                    this.B = qr4VarK0;
                                    this.A = 1;
                                    uk3Var.getClass();
                                    al3 al3Var = new al3(uk3Var, null);
                                    yg2 yg2Var = (yg2) this.x.j(yg2.QnHx.w);
                                    if (yg2Var == null) {
                                        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
                                    }
                                    Object objD0 = fp1.D0(uk3Var.a, new zk3(uk3Var, al3Var, yg2Var, null), this);
                                    if (objD0 != obj2) {
                                        objD0 = sd5.a;
                                    }
                                    if (objD0 != obj2) {
                                        objD0 = sd5.a;
                                    }
                                    if (objD0 == obj2) {
                                        return obj2;
                                    }
                                    ms1Var = qr4VarK0;
                                    if (ms1Var != null) {
                                        ms1Var.m(null);
                                    }
                                    d32Var.c().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                                    return sd5.a;
                                } catch (Throwable th2) {
                                    ms1Var = qr4VarK0;
                                    th = th2;
                                    if (ms1Var != null) {
                                        ms1Var.m(null);
                                    }
                                    d32Var.c().c(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                ms1Var = null;
                            }
                        }

                        @Override // defpackage.x81
                        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
                        }
                    }

                    public /* synthetic */ class QnHx {
                        public static final /* synthetic */ int[] a;

                        static {
                            int[] iArr = new int[androidx.lifecycle.YKK.CQf.values().length];
                            iArr[androidx.lifecycle.YKK.CQf.ON_CREATE.ordinal()] = 1;
                            iArr[androidx.lifecycle.YKK.CQf.ON_START.ordinal()] = 2;
                            iArr[androidx.lifecycle.YKK.CQf.ON_STOP.ordinal()] = 3;
                            iArr[androidx.lifecycle.YKK.CQf.ON_DESTROY.ordinal()] = 4;
                            iArr[androidx.lifecycle.YKK.CQf.ON_PAUSE.ordinal()] = 5;
                            iArr[androidx.lifecycle.YKK.CQf.ON_RESUME.ordinal()] = 6;
                            iArr[androidx.lifecycle.YKK.CQf.ON_ANY.ordinal()] = 7;
                            a = iArr;
                        }
                    }

                    @Override // androidx.lifecycle.auxFixed
                    public final void h(d32 d32Var, androidx.lifecycle.YKK.CQf cQf) {
                        boolean z;
                        int i = QnHx.a[cQf.ordinal()];
                        if (i == 1) {
                            fp1.k0(w80VarJ, null, 4, new CQf(jl3Var, uk3Var, d32Var, this, view, null), 1);
                            return;
                        }
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return;
                                }
                                uk3Var.t();
                                return;
                            }
                            xz2 xz2Var3 = xz2Var2;
                            if (xz2Var3 != null) {
                                dy1 dy1Var2 = xz2Var3.x;
                                synchronized (dy1Var2.a) {
                                    dy1Var2.d = false;
                                    sd5 sd5Var2 = sd5.a;
                                }
                                return;
                            }
                            return;
                        }
                        xz2 xz2Var4 = xz2Var2;
                        if (xz2Var4 != null) {
                            dy1 dy1Var3 = xz2Var4.x;
                            synchronized (dy1Var3.a) {
                                synchronized (dy1Var3.a) {
                                    z = dy1Var3.d;
                                }
                                if (z) {
                                    return;
                                }
                                List<z80<sd5>> list = dy1Var3.b;
                                dy1Var3.b = dy1Var3.c;
                                dy1Var3.c = list;
                                dy1Var3.d = true;
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    list.get(i2).x(sd5.a);
                                }
                                list.clear();
                                sd5 sd5Var3 = sd5.a;
                            }
                        }
                    }
                });
                return uk3Var;
            }
        }
    }

    uk3 a(View view);
}
