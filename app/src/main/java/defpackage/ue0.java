package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ InvalidProtocolBufferException w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(InvalidProtocolBufferException invalidProtocolBufferException) {
        super(0);
        this.w = invalidProtocolBufferException;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.d(this.w, false);
        return sd5.a;
    }
}
