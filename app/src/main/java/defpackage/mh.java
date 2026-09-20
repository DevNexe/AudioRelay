package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mh extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ad0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ j81<sg, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mh(ad0 ad0Var, boolean z, j81<? super sg, sd5> j81Var, int i) {
        super(2);
        this.w = ad0Var;
        this.x = z;
        this.y = j81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        boolean z = this.x;
        j81<sg, sd5> j81Var = this.y;
        fh.e(this.w, z, j81Var, g30Var, i);
        return sd5.a;
    }
}
