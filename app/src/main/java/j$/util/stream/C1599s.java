package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import j$.util.function.InterfaceC1478f;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1599s implements InterfaceC1478f {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiConsumer b;

    public /* synthetic */ C1599s(BiConsumer biConsumer, int i) {
        this.a = i;
        this.b = biConsumer;
    }

    @Override // j$.util.function.BiFunction
    public final BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                function.getClass();
                break;
            case 1:
                function.getClass();
                break;
            default:
                function.getClass();
                break;
        }
        return new j$.util.concurrent.u(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        BiConsumer biConsumer = this.b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                break;
            case 1:
                biConsumer.accept(obj, obj2);
                break;
            default:
                biConsumer.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
