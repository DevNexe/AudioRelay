package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eNa extends cx1 implements h81<sd5> {
    public final /* synthetic */ C.k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eNa(C.k kVar) {
        super(0);
        this.w = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final sd5 invoke() {
        C.k kVar = this.w;
        kVar.D.setValue(Boolean.valueOf(!((Boolean) kVar.D.getValue()).booleanValue()));
        return sd5.a;
    }
}
