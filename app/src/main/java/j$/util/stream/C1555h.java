package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1555h implements BaseStream {
    public final /* synthetic */ InterfaceC1560i a;

    private /* synthetic */ C1555h(InterfaceC1560i interfaceC1560i) {
        this.a = interfaceC1560i;
    }

    public static /* synthetic */ BaseStream y(InterfaceC1560i interfaceC1560i) {
        if (interfaceC1560i == null) {
            return null;
        }
        if (interfaceC1560i instanceof C1550g) {
            return ((C1550g) interfaceC1560i).a;
        }
        if (interfaceC1560i instanceof G) {
            return F.y((G) interfaceC1560i);
        }
        if (interfaceC1560i instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) interfaceC1560i);
        }
        if (interfaceC1560i instanceof InterfaceC1581n0) {
            return C1577m0.y((InterfaceC1581n0) interfaceC1560i);
        }
        return interfaceC1560i instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC1560i) : new C1555h(interfaceC1560i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1560i interfaceC1560i = this.a;
        if (obj instanceof C1555h) {
            obj = ((C1555h) obj).a;
        }
        return interfaceC1560i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return y(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return y(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return y(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return y(this.a.unordered());
    }
}
