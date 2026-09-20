package j$.util.function;

import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: j$.util.function.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1474d implements InterfaceC1478f {
    public final /* synthetic */ BinaryOperator a;

    private /* synthetic */ C1474d(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ InterfaceC1478f a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C1476e ? ((C1476e) binaryOperator).a : new C1474d(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.a.andThen(E.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1474d) {
            obj = ((C1474d) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
