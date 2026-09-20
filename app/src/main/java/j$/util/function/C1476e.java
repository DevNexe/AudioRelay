package j$.util.function;

import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: j$.util.function.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1476e implements BinaryOperator {
    public final /* synthetic */ InterfaceC1478f a;

    private /* synthetic */ C1476e(InterfaceC1478f interfaceC1478f) {
        this.a = interfaceC1478f;
    }

    public static /* synthetic */ BinaryOperator a(InterfaceC1478f interfaceC1478f) {
        if (interfaceC1478f == null) {
            return null;
        }
        return interfaceC1478f instanceof C1474d ? ((C1474d) interfaceC1478f).a : new C1476e(interfaceC1478f);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return C1470b.a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1478f interfaceC1478f = this.a;
        if (obj instanceof C1476e) {
            obj = ((C1476e) obj).a;
        }
        return interfaceC1478f.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
