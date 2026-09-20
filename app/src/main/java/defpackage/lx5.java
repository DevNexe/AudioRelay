package defpackage;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class lx5 implements kx5 {
    public final FileChannel w;
    public final long x;
    public final long y;

    public lx5(FileChannel fileChannel, long j, long j2) {
        this.w = fileChannel;
        this.x = j;
        this.y = j2;
    }

    @Override // defpackage.kx5
    public final void c(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.w.map(FileChannel.MapMode.READ_ONLY, this.x + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // defpackage.kx5
    public final long d() {
        return this.y;
    }
}
