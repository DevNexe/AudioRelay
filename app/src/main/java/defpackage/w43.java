package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w43 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ y43 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(y43 y43Var) {
        super(0);
        this.w = y43Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        return Boolean.valueOf(!ps0.M("Windows Vista", "Windows 7", "Windows 8", "Windows 8.1", "Windows Server 2008", "Windows Server 2008 R2", "Windows Server 2012", "Windows Server 2012 R2").contains(this.w.a));
    }
}
