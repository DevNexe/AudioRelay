package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v6uO extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ nyd w;
    public final /* synthetic */ If$.QnHx x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6uO(nyd nydVar, If$.QnHx qnHx) {
        super(1);
        this.w = nydVar;
        this.x = qnHx;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        this.w.a.s.setValue(Integer.valueOf(this.x.a.w));
        return sd5.a;
    }
}
