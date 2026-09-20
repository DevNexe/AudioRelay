package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1598r2 extends AbstractC1535d {
    private final AbstractC1530c j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    C1598r2(AbstractC1530c abstractC1530c, AbstractC1530c abstractC1530c2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC1530c2, spliterator);
        this.j = abstractC1530c;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    C1598r2(C1598r2 c1598r2, Spliterator spliterator) {
        super(c1598r2, spliterator);
        this.j = c1598r2.j;
        this.k = c1598r2.k;
        this.l = c1598r2.l;
        this.m = c1598r2.m;
    }

    private long j(long j) {
        if (this.o) {
            return this.n;
        }
        C1598r2 c1598r2 = (C1598r2) this.d;
        C1598r2 c1598r3 = (C1598r2) this.e;
        if (c1598r2 == null || c1598r3 == null) {
            return this.n;
        }
        long j2 = c1598r2.j(j);
        return j2 >= j ? j2 : j2 + c1598r3.j(j);
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final Object a() {
        if (c() == null) {
            A0 a0R1 = this.j.r1(V2.SIZED.z(this.j.j) ? this.j.a1(this.b) : -1L, this.k);
            InterfaceC1558h2 interfaceC1558h2K1 = this.j.K1(this.a.g1(), a0R1);
            AbstractC1616w0 abstractC1616w0 = this.a;
            abstractC1616w0.W0(this.b, abstractC1616w0.x1(interfaceC1558h2K1));
            return a0R1.build();
        }
        AbstractC1616w0 abstractC1616w1 = this.a;
        A0 a0R2 = abstractC1616w1.r1(-1L, this.k);
        abstractC1616w1.w1(this.b, a0R2);
        F0 f0Build = a0R2.build();
        this.n = f0Build.count();
        this.o = true;
        this.b = null;
        return f0Build;
    }

    @Override // j$.util.stream.AbstractC1545f
    protected final AbstractC1545f d(Spliterator spliterator) {
        return new C1598r2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1535d
    protected final void g() {
        this.i = true;
        if (this.o) {
            e(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1535d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Z0 i() {
        return AbstractC1616w0.Z0(this.j.D1());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    @Override // j$.util.stream.AbstractC1545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C1598r2 c1598r2;
        F0 f0U0;
        F0 f0Q;
        boolean z;
        long jMin;
        AbstractC1545f abstractC1545f = this.d;
        boolean z2 = true;
        if (!(abstractC1545f == null)) {
            this.n = ((C1598r2) abstractC1545f).n + ((C1598r2) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else {
                if (this.n != 0) {
                    f0U0 = ((C1598r2) this.d).n == 0 ? (F0) ((C1598r2) this.e).b() : AbstractC1616w0.U0(this.j.D1(), (F0) ((C1598r2) this.d).b(), (F0) ((C1598r2) this.e).b());
                }
                f0Q = f0U0;
                if (c() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.m >= 0) {
                        jMin = Math.min(f0Q.count(), this.l + this.m);
                    } else {
                        jMin = this.n;
                    }
                    f0Q = f0Q.q(this.l, jMin, this.k);
                }
                e(f0Q);
                this.o = true;
            }
            f0U0 = i();
            f0Q = f0U0;
            if (c() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.m >= 0) {
                    jMin = Math.min(f0Q.count(), this.l + this.m);
                } else {
                    jMin = this.n;
                }
                f0Q = f0Q.q(this.l, jMin, this.k);
            }
            e(f0Q);
            this.o = true;
        }
        if (this.m >= 0) {
            if (!(c() == null)) {
                long j = this.l + this.m;
                long j2 = this.o ? this.n : j(j);
                if (j2 < j) {
                    C1598r2 c1598r3 = (C1598r2) c();
                    Object obj = this;
                    while (true) {
                        if (c1598r3 == null) {
                            if (j2 >= j) {
                                break;
                            }
                            z2 = false;
                            break;
                        } else {
                            if (obj == c1598r3.e && (c1598r2 = (C1598r2) c1598r3.d) != null) {
                                j2 += c1598r2.j(j);
                                if (j2 >= j) {
                                    break;
                                }
                            }
                            obj = c1598r3;
                            c1598r3 = (C1598r2) c1598r3.c();
                        }
                    }
                }
                if (z2) {
                    h();
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
