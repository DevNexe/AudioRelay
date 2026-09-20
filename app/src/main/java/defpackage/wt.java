package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wt extends cx1 implements j81<Byte, sd5> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ StringBuilder x;
    public final /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(boolean z, StringBuilder sb, boolean z2) {
        super(1);
        this.w = z;
        this.x = sb;
        this.y = z2;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Byte b) {
        byte bByteValue = b.byteValue();
        byte b2 = (byte) 32;
        StringBuilder sb = this.x;
        if (bByteValue == b2) {
            if (this.w) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (tt.a.contains(Byte.valueOf(bByteValue)) || (!this.y && tt.d.contains(Byte.valueOf(bByteValue)))) {
            sb.append((char) bByteValue);
        } else {
            sb.append(tt.a(bByteValue));
        }
        return sd5.a;
    }
}
