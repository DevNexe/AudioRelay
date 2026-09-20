package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1493m0;
import j$.util.function.InterfaceC1501t;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1584o implements Consumer, Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1584o(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
            default:
                ((C1544e3) obj3).i((Consumer) obj2, obj);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 5:
                break;
            default:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                return new C1589p0((j$.util.function.P) obj, (EnumC1604t0) obj2);
            case 2:
                return new C1585o0((Predicate) obj, (EnumC1604t0) obj2);
            case 3:
                return new C1596r0((InterfaceC1501t) obj, (EnumC1604t0) obj2);
            default:
                return new C1593q0((InterfaceC1493m0) obj, (EnumC1604t0) obj2);
        }
    }
}
