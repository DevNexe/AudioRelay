package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qx4 extends j93 implements k93, l93, ij0 {
    public y83 D;
    public final ti5 y;
    public final /* synthetic */ ij0 z;
    public y83 A = tx4.a;
    public final ui2<QnHx<?>> B = new ui2<>(new QnHx[16]);
    public final ui2<QnHx<?>> C = new ui2<>(new QnHx[16]);
    public long E = 0;
    public ua0 F = ha1.w;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ QnHx<R> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(QnHx<R> qnHx) {
            super(1);
            this.w = qnHx;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            QnHx<R> qnHx = this.w;
            wm<? super y83> wmVar = qnHx.y;
            if (wmVar != null) {
                wmVar.l(th2);
            }
            qnHx.y = null;
            return sd5.a;
        }
    }

    public final class QnHx<R> implements a5, ij0, z80<R> {
        public final z80<R> w;
        public final /* synthetic */ qx4 x;
        public wm<? super y83> y;
        public z83 z = z83.Main;

        @if0(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {617, 618}, m = "invokeSuspend")
        public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ long B;
            public final /* synthetic */ QnHx<R> C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CQf(long j, QnHx<R> qnHx, z80<? super CQf> z80Var) {
                super(2, z80Var);
                this.B = j;
                this.C = qnHx;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new CQf(this.B, this.C, z80Var);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x003d  */
            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                wm<? super y83> wmVar;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                long j = this.B;
                if (i != 0) {
                    if (i == 1) {
                        C0239D.H(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    wmVar = this.C.y;
                    if (wmVar != null) {
                        wmVar.x(new fq3.QnHx(new PointerEventTimeoutCancellationException(j)));
                    }
                    return sd5.a;
                }
                C0239D.H(obj);
                this.A = 1;
                if (S12N.e(j - 1, this) == va0Var) {
                    return va0Var;
                }
                this.A = 2;
                if (S12N.e(1L, this) == va0Var) {
                    return va0Var;
                }
                wmVar = this.C.y;
                if (wmVar != null) {
                    wmVar.x(new fq3.QnHx(new PointerEventTimeoutCancellationException(j)));
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX INFO: renamed from: qx4$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {625}, m = "withTimeout")
        public static final class C0185QnHx<T> extends b90 {
            public /* synthetic */ Object A;
            public final /* synthetic */ QnHx<R> B;
            public int C;
            public qr4 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185QnHx(QnHx<R> qnHx, z80<? super C0185QnHx> z80Var) {
                super(z80Var);
                this.B = qnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.A = obj;
                this.C |= Integer.MIN_VALUE;
                return this.B.t(0L, null, this);
            }
        }

        public QnHx(xm xmVar) {
            this.w = xmVar;
            this.x = qx4.this;
        }

        @Override // defpackage.ij0
        public final float Q(float f) {
            return this.x.Q(f);
        }

        @Override // defpackage.ij0
        public final float U() {
            return this.x.U();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.a5
        public final Object X(long j, q05 q05Var, z80 z80Var) throws Throwable {
            rx4 rx4Var;
            if (z80Var instanceof rx4) {
                rx4Var = (rx4) z80Var;
                int i = rx4Var.B;
                if ((i & Integer.MIN_VALUE) != 0) {
                    rx4Var.B = i - Integer.MIN_VALUE;
                } else {
                    rx4Var = new rx4(this, z80Var);
                }
            } else {
                rx4Var = new rx4(this, z80Var);
            }
            Object objT = rx4Var.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = rx4Var.B;
            try {
                if (i2 == 0) {
                    C0239D.H(objT);
                    rx4Var.B = 1;
                    objT = t(j, q05Var, rx4Var);
                    if (objT == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(objT);
                }
                return objT;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // defpackage.a5
        public final long a() {
            return qx4.this.E;
        }

        @Override // defpackage.ij0
        public final float b0(float f) {
            return this.x.b0(f);
        }

        @Override // defpackage.a5
        public final long f0() {
            qx4 qx4Var = qx4.this;
            long jV0 = qx4Var.v0(qx4Var.y.d());
            iy1 iy1Var = qx4Var.w;
            long jA = iy1Var != null ? iy1Var.a() : 0L;
            return ps0.e(Math.max(0.0f, cm4.e(jV0) - ((int) (jA >> 32))) / 2.0f, Math.max(0.0f, cm4.c(jV0) - sp1.b(jA)) / 2.0f);
        }

        @Override // defpackage.z80
        public final la0 getContext() {
            return xr0.w;
        }

        @Override // defpackage.ij0
        public final float getDensity() {
            return this.x.getDensity();
        }

        @Override // defpackage.a5
        public final ti5 getViewConfiguration() {
            return qx4.this.y;
        }

        @Override // defpackage.ij0
        public final float j(int i) {
            return this.x.j(i);
        }

        @Override // defpackage.a5
        public final Object n0(z83 z83Var, m8 m8Var) {
            xm xmVar = new xm(1, ps0.L(m8Var));
            xmVar.r();
            this.z = z83Var;
            this.y = xmVar;
            return xmVar.p();
        }

        @Override // defpackage.ij0
        public final int p0(float f) {
            return this.x.p0(f);
        }

        @Override // defpackage.a5
        public final y83 s() {
            return qx4.this.A;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [long] */
        /* JADX WARN: Type inference failed for: r8v1, types: [ms1] */
        /* JADX WARN: Type inference failed for: r8v4, types: [ms1] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // defpackage.a5
        public final <T> Object t(long j, x81<? super a5, ? super z80<? super T>, ? extends Object> x81Var, z80<? super T> z80Var) throws Throwable {
            C0185QnHx c0185QnHx;
            wm<? super y83> wmVar;
            if (z80Var instanceof C0185QnHx) {
                c0185QnHx = (C0185QnHx) z80Var;
                int i = c0185QnHx.C;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0185QnHx.C = i - Integer.MIN_VALUE;
                } else {
                    c0185QnHx = new C0185QnHx(this, z80Var);
                }
            } else {
                c0185QnHx = new C0185QnHx(this, z80Var);
            }
            Object objInvoke = c0185QnHx.A;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0185QnHx.C;
            try {
                if (i2 == 0) {
                    C0239D.H(objInvoke);
                    if (j <= 0 && (wmVar = this.y) != null) {
                        wmVar.x(new fq3.QnHx(new PointerEventTimeoutCancellationException(j)));
                    }
                    qr4 qr4VarK0 = fp1.k0(qx4.this.F, null, 0, new CQf(j, this, null), 3);
                    c0185QnHx.z = qr4VarK0;
                    c0185QnHx.C = 1;
                    objInvoke = x81Var.invoke(this, c0185QnHx);
                    j = qr4VarK0;
                    if (objInvoke == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qr4 qr4Var = c0185QnHx.z;
                    C0239D.H(objInvoke);
                    j = qr4Var;
                }
                j.m(null);
                return objInvoke;
            } catch (Throwable th) {
                j.m(null);
                throw th;
            }
        }

        @Override // defpackage.ij0
        public final long v(long j) {
            return this.x.v(j);
        }

        @Override // defpackage.ij0
        public final long v0(long j) {
            return this.x.v0(j);
        }

        @Override // defpackage.z80
        public final void x(Object obj) {
            qx4 qx4Var = qx4.this;
            synchronized (qx4Var.B) {
                qx4Var.B.l(this);
                sd5 sd5Var = sd5.a;
            }
            this.w.x(obj);
        }

        @Override // defpackage.ij0
        public final float x0(long j) {
            return this.x.x0(j);
        }
    }

    public qx4(ti5 ti5Var, ij0 ij0Var) {
        this.y = ti5Var;
        this.z = ij0Var;
    }

    @Override // defpackage.j93
    public final void A() {
        boolean z;
        y83 y83Var = this.D;
        if (y83Var == null) {
            return;
        }
        List<d93> list = y83Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            z = true;
            if (i >= size) {
                break;
            }
            if (!(true ^ list.get(i).d)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d93 d93Var = list.get(i2);
            long j = d93Var.a;
            long j2 = d93Var.c;
            long j3 = d93Var.b;
            boolean z2 = d93Var.d;
            arrayList.add(new d93(j, j3, j2, false, j3, j2, z2, z2, 1, kt2.b));
        }
        y83 y83Var2 = new y83(arrayList, null);
        this.A = y83Var2;
        Z(y83Var2, z83.Initial);
        Z(y83Var2, z83.Main);
        Z(y83Var2, z83.Final);
        this.D = null;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.j93
    public final void I(y83 y83Var, z83 z83Var, long j) {
        this.E = j;
        if (z83Var == z83.Initial) {
            this.A = y83Var;
        }
        Z(y83Var, z83Var);
        List<d93> list = y83Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Cz.g(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            y83Var = null;
        }
        this.D = y83Var;
    }

    @Override // defpackage.k93
    public final j93 N() {
        return this;
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return this.z.Q(f);
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.z.U();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:24:0x003a, B:26:0x0040, B:27:0x0043, B:29:0x004b, B:31:0x004f), top: B:44:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:24:0x003a, B:26:0x0040, B:27:0x0043, B:29:0x004b, B:31:0x004f), top: B:44:0x000d }] */
    public final void Z(y83 y83Var, z83 z83Var) {
        ui2<QnHx<?>> ui2Var;
        int i;
        QnHx<?>[] qnHxArr;
        int i2;
        QnHx<?> qnHx;
        wm<? super y83> wmVar;
        wm<? super y83> wmVar2;
        synchronized (this.B) {
            ui2<QnHx<?>> ui2Var2 = this.C;
            ui2Var2.c(ui2Var2.y, this.B);
        }
        try {
            int iOrdinal = z83Var.ordinal();
            if (iOrdinal == 0) {
                ui2Var = this.C;
                i = ui2Var.y;
                if (i > 0) {
                    qnHxArr = ui2Var.w;
                    i2 = 0;
                    do {
                        qnHx = qnHxArr[i2];
                        if (z83Var == qnHx.z && (wmVar = qnHx.y) != null) {
                            qnHx.y = null;
                            wmVar.x(y83Var);
                        }
                        i2++;
                    } while (i2 < i);
                }
            } else if (iOrdinal == 1) {
                ui2<QnHx<?>> ui2Var3 = this.C;
                int i3 = ui2Var3.y;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    QnHx<?>[] qnHxArr2 = ui2Var3.w;
                    do {
                        QnHx<?> qnHx2 = qnHxArr2[i4];
                        if (z83Var == qnHx2.z && (wmVar2 = qnHx2.y) != null) {
                            qnHx2.y = null;
                            wmVar2.x(y83Var);
                        }
                        i4--;
                    } while (i4 >= 0);
                }
            } else if (iOrdinal == 2) {
                ui2Var = this.C;
                i = ui2Var.y;
                if (i > 0) {
                    qnHxArr = ui2Var.w;
                    i2 = 0;
                    do {
                        qnHx = qnHxArr[i2];
                        if (z83Var == qnHx.z) {
                            qnHx.y = null;
                            wmVar.x(y83Var);
                        }
                        i2++;
                    } while (i2 < i);
                }
            }
        } finally {
            this.C.e();
        }
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return this.z.b0(f);
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.z.getDensity();
    }

    @Override // defpackage.l93
    public final ti5 getViewConfiguration() {
        return this.y;
    }

    @Override // defpackage.l93
    public final <R> Object i0(x81<? super a5, ? super z80<? super R>, ? extends Object> x81Var, z80<? super R> z80Var) {
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        QnHx qnHx = new QnHx(xmVar);
        synchronized (this.B) {
            this.B.b(qnHx);
            new c24(va0.COROUTINE_SUSPENDED, ps0.L(ps0.v(qnHx, qnHx, x81Var))).x(sd5.a);
        }
        xmVar.B(new CQf(qnHx));
        return xmVar.p();
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return this.z.j(i);
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.ij0
    public final int p0(float f) {
        return this.z.p0(f);
    }

    @Override // defpackage.ij0
    public final long v(long j) {
        return this.z.v(j);
    }

    @Override // defpackage.ij0
    public final long v0(long j) {
        return this.z.v0(j);
    }

    @Override // defpackage.ij0
    public final float x0(long j) {
        return this.z.x0(j);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
