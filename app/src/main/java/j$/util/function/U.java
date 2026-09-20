package j$.util.function;

import java.util.function.IntToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class U implements W {
    public final /* synthetic */ IntToLongFunction a;

    private /* synthetic */ U(IntToLongFunction intToLongFunction) {
        this.a = intToLongFunction;
    }

    public static /* synthetic */ W a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof V ? ((V) intToLongFunction).a : new U(intToLongFunction);
    }

    @Override // j$.util.function.W
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof U) {
            obj = ((U) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
