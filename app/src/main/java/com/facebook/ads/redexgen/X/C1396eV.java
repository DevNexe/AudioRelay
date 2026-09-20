package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1396eV<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;

    @Nullable
    public List<InterfaceC1398eX<ModelType, StateType>> A01 = null;
    public C1395eU A00 = C1395eU.A06;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1396eV(ModelType modeltype, StateType statetype, String str) {
        this.A02 = modeltype;
        this.A03 = statetype;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1396eV<ModelType, StateType> A05(InterfaceC1398eX<ModelType, StateType> interfaceC1398eX) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1398eX);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1395eU<ModelType, StateType> A06() {
        return new C1395eU<>(this);
    }
}
