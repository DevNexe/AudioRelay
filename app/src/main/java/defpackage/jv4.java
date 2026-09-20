package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jv4 extends cx1 implements x81<CharSequence, Integer, uy2<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv4(char[] cArr, boolean z) {
        super(2);
        this.w = cArr;
        this.x = z;
    }

    @Override // defpackage.x81
    public final uy2<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        int iG = mv4.G(num.intValue(), charSequence, this.x, this.w);
        if (iG < 0) {
            return null;
        }
        return new uy2<>(Integer.valueOf(iG), 1);
    }
}
