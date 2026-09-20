package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J0 implements Supplier {
    public final /* synthetic */ java.util.function.Supplier a;

    private /* synthetic */ J0(java.util.function.Supplier supplier) {
        this.a = supplier;
    }

    public static /* synthetic */ Supplier a(java.util.function.Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof K0 ? ((K0) supplier).a : new J0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof J0) {
            obj = ((J0) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
