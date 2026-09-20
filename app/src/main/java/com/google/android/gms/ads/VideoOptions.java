package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzff;

/* JADX INFO: loaded from: classes.dex */
public final class VideoOptions {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public static final class Builder {
        public boolean a = true;
        public boolean b = false;
        public boolean c = false;

        public VideoOptions build() {
            return new VideoOptions(this);
        }

        public Builder setClickToExpandRequested(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setStartMuted(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public VideoOptions(zzff zzffVar) {
        this.a = zzffVar.zza;
        this.b = zzffVar.zzb;
        this.c = zzffVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.c;
    }

    public boolean getCustomControlsRequested() {
        return this.b;
    }

    public boolean getStartMuted() {
        return this.a;
    }
}
