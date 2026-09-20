package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ z24 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(boolean z, z24 z24Var, String str) {
        super(0);
        this.w = z;
        this.x = z24Var;
        this.y = str;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        if (this.w) {
            this.x.a.c(this.y);
        }
        return sd5.a;
    }
}
