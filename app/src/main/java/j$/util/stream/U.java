package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class U extends CountedCompleter {
    public static final /* synthetic */ int h = 0;
    private final AbstractC1616w0 a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final InterfaceC1558h2 e;
    private final U f;
    private F0 g;

    U(U u, Spliterator spliterator, U u2) {
        super(u);
        this.a = u.a;
        this.b = spliterator;
        this.c = u.c;
        this.d = u.d;
        this.e = u.e;
        this.f = u2;
    }

    protected U(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2) {
        super(null);
        this.a = abstractC1616w0;
        this.b = spliterator;
        this.c = AbstractC1545f.f(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC1545f.g << 1));
        this.e = interfaceC1558h2;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        U u = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            U u2 = new U(u, spliteratorTrySplit, u.f);
            U u3 = new U(u, spliterator, u2);
            u.addToPendingCount(1);
            u3.addToPendingCount(1);
            u.d.put(u2, u3);
            if (u.f != null) {
                u2.addToPendingCount(1);
                if (u.d.replace(u.f, u, u2)) {
                    u.addToPendingCount(-1);
                } else {
                    u2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                u = u2;
                u2 = u3;
            } else {
                u = u3;
            }
            z = !z;
            u2.fork();
        }
        if (u.getPendingCount() > 0) {
            C1525b c1525b = new C1525b(14);
            AbstractC1616w0 abstractC1616w0 = u.a;
            A0 a0R1 = abstractC1616w0.r1(abstractC1616w0.a1(spliterator), c1525b);
            u.a.w1(spliterator, a0R1);
            u.g = a0R1.build();
            u.b = null;
        }
        u.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        F0 f0 = this.g;
        if (f0 != null) {
            f0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.w1(spliterator, this.e);
                this.b = null;
            }
        }
        U u = (U) this.d.remove(this);
        if (u != null) {
            u.tryComplete();
        }
    }
}
