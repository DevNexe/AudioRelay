package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb1 extends cx1 implements h81<Integer> {
    public final /* synthetic */ lKy3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(lKy3 lky3) {
        super(0);
        this.w = lky3;
    }

    @Override // defpackage.h81
    public final Integer invoke() {
        return Integer.valueOf(this.w.e().getInt("OPUS_BITRATE", 128000));
    }
}
