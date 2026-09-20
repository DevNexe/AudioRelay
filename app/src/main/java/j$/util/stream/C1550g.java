package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1550g implements InterfaceC1560i {
    public final /* synthetic */ BaseStream a;

    private /* synthetic */ C1550g(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC1560i y(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C1555h) {
            return ((C1555h) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return E.y((DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C1573l0.y((LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? S2.y((java.util.stream.Stream) baseStream) : new C1550g(baseStream);
    }

    @Override // j$.util.stream.InterfaceC1560i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1550g) {
            obj = ((C1550g) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i onClose(Runnable runnable) {
        return y(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i parallel() {
        return y(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ InterfaceC1560i sequential() {
        return y(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1560i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.M.f(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1560i
    public final /* synthetic */ InterfaceC1560i unordered() {
        return y(this.a.unordered());
    }
}
