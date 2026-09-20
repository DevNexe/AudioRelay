package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wr4 implements vj4 {
    public final long a;
    public final long b;

    @if0(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<tj4, z80<? super Boolean>, Object> {
        public /* synthetic */ Object A;

        public CQf(z80<? super CQf> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = new CQf(z80Var);
            cQf.A = obj;
            return cQf;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return Boolean.valueOf(((tj4) this.A) != tj4.START);
        }

        @Override // defpackage.x81
        public final Object invoke(tj4 tj4Var, z80<? super Boolean> z80Var) {
            return ((CQf) a(tj4Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements y81<nz0<? super tj4>, Integer, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ nz0 B;
        public /* synthetic */ int C;

        public QnHx(z80<? super QnHx> z80Var) {
            super(3, z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        /* JADX WARN: Code duplicated, block: B:29:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0087 A[RETURN] */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            nz0 nz0Var;
            tj4 tj4Var;
            long j;
            tj4 tj4Var2;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            wr4 wr4Var = wr4.this;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        nz0Var = this.B;
                        C0239D.H(obj);
                        if (wr4Var.b > 0) {
                            tj4Var = tj4.STOP;
                            this.B = nz0Var;
                            this.A = 3;
                            if (nz0Var.f(tj4Var, this) == va0Var) {
                                return va0Var;
                            }
                            j = wr4Var.b;
                            this.B = nz0Var;
                            this.A = 4;
                            if (S12N.e(j, this) == va0Var) {
                                return va0Var;
                            }
                        }
                    } else if (i == 3) {
                        nz0Var = this.B;
                        C0239D.H(obj);
                        j = wr4Var.b;
                        this.B = nz0Var;
                        this.A = 4;
                        if (S12N.e(j, this) == va0Var) {
                            return va0Var;
                        }
                    } else if (i == 4) {
                        nz0Var = this.B;
                        C0239D.H(obj);
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tj4Var2 = tj4.STOP_AND_RESET_REPLAY_CACHE;
                    this.B = null;
                    this.A = 5;
                    if (nz0Var.f(tj4Var2, this) == va0Var) {
                        return va0Var;
                    }
                }
                C0239D.H(obj);
            } else {
                C0239D.H(obj);
                nz0 nz0Var2 = this.B;
                if (this.C > 0) {
                    tj4 tj4Var3 = tj4.START;
                    this.A = 1;
                    if (nz0Var2.f(tj4Var3, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    long j2 = wr4Var.a;
                    this.B = nz0Var2;
                    this.A = 2;
                    if (S12N.e(j2, this) == va0Var) {
                        return va0Var;
                    }
                    nz0Var = nz0Var2;
                    if (wr4Var.b > 0) {
                        tj4Var = tj4.STOP;
                        this.B = nz0Var;
                        this.A = 3;
                        if (nz0Var.f(tj4Var, this) == va0Var) {
                            return va0Var;
                        }
                        j = wr4Var.b;
                        this.B = nz0Var;
                        this.A = 4;
                        if (S12N.e(j, this) == va0Var) {
                            return va0Var;
                        }
                    }
                    tj4Var2 = tj4.STOP_AND_RESET_REPLAY_CACHE;
                    this.B = null;
                    this.A = 5;
                    if (nz0Var.f(tj4Var2, this) == va0Var) {
                        return va0Var;
                    }
                }
            }
            return sd5.a;
        }

        @Override // defpackage.y81
        public final Object invoke(nz0<? super tj4> nz0Var, Integer num, z80<? super sd5> z80Var) {
            int iIntValue = num.intValue();
            QnHx qnHx = wr4.this.new QnHx(z80Var);
            qnHx.B = nz0Var;
            qnHx.C = iIntValue;
            return qnHx.i(sd5.a);
        }
    }

    public wr4(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    @Override // defpackage.vj4
    public final mz0<tj4> a(js4<Integer> js4Var) {
        return kd.i(new b01(new CQf(null), kd.G(js4Var, new QnHx(null))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wr4) {
            wr4 wr4Var = (wr4) obj;
            if (this.a == wr4Var.a && this.b == wr4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        y32 y32Var = new y32(2);
        long j = this.a;
        if (j > 0) {
            y32Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            y32Var.add("replayExpiration=" + j2 + "ms");
        }
        if (y32Var.A != null) {
            throw new IllegalStateException();
        }
        y32Var.f();
        y32Var.z = true;
        return bl2.c(new StringBuilder("SharingStarted.WhileSubscribed("), wu.M0(y32Var, null, null, null, null, 63), ')');
    }
}
