package j$.util.stream;

import j$.util.C1466e;
import j$.util.C1467f;
import j$.util.C1508g;
import j$.util.C1510i;
import j$.util.C1511j;
import j$.util.C1512k;
import j$.util.Optional;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1473c0;
import j$.util.function.InterfaceC1486j;
import j$.util.function.InterfaceC1499q;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToLongFunction;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class S1 implements IntFunction, ToLongFunction, Consumer, Supplier, BiConsumer, InterfaceC1486j, InterfaceC1499q, j$.util.function.z0, Predicate, j$.util.function.H, j$.util.function.C0, InterfaceC1473c0 {
    public final /* synthetic */ int a;

    public /* synthetic */ S1(int i) {
        this.a = i;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        switch (this.a) {
            case 19:
                predicate.getClass();
                break;
            case 20:
                predicate.getClass();
                break;
            case 21:
                predicate.getClass();
                break;
            default:
                predicate.getClass();
                break;
        }
        return new j$.util.function.G0(this, predicate, 0);
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
    }

    @Override // j$.util.function.z0
    public final void accept(Object obj, double d) {
        ((C1466e) obj).accept(d);
    }

    @Override // j$.util.function.C0
    public final void accept(Object obj, int i) {
        ((C1467f) obj).accept(i);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 13:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 18:
                ((C1466e) obj).a((C1466e) obj2);
                break;
            default:
                ((C1467f) obj).a((C1467f) obj2);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 6:
                break;
            default:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.InterfaceC1499q
    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
            default:
                return Integer.valueOf(i);
            case 2:
                return new Object[i];
            case 3:
                return new Integer[i];
            case 4:
                return new Long[i];
            case 5:
                return new Double[i];
        }
    }

    @Override // j$.util.function.InterfaceC1486j
    public final double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 14:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // j$.util.function.H
    public final int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 23:
                return Math.min(i, i2);
            case 24:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // j$.util.function.InterfaceC1473c0
    public final long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        switch (this.a) {
            case 19:
                predicate.getClass();
                break;
            case 20:
                predicate.getClass();
                break;
            case 21:
                predicate.getClass();
                break;
            default:
                predicate.getClass();
                break;
        }
        return new j$.util.function.G0(this, predicate, 1);
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.a) {
            case 12:
                biConsumer.getClass();
                break;
            case 13:
                biConsumer.getClass();
                break;
            case 18:
                biConsumer.getClass();
                break;
            default:
                biConsumer.getClass();
                break;
        }
        return new j$.util.concurrent.u(1, this, biConsumer);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 8:
                return new C1466e();
            case 9:
                return new C1467f();
            case 10:
                return new C1508g();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.a) {
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            default:
                break;
        }
        return new j$.util.function.H0(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 19:
                return ((C1510i) obj).c();
            case 20:
                return ((C1512k) obj).c();
            case 21:
                return ((Optional) obj).isPresent();
            default:
                return ((C1511j) obj).c();
        }
    }
}
