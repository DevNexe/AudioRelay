package j$.util.function;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G implements IntBinaryOperator {
    public final /* synthetic */ H a;

    private /* synthetic */ G(H h) {
        this.a = h;
    }

    public static /* synthetic */ IntBinaryOperator a(H h) {
        if (h == null) {
            return null;
        }
        return h instanceof F ? ((F) h).a : new G(h);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
