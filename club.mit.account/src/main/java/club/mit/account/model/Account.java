package club.mit.account.model;

import java.util.Arrays;

public class Account {

	// 地址
    private String address;

    // 账户别名
    private String alias;

    // 状态
    private int status;

    // 公钥
    private byte[] pubKey;

    // 创建时间
    private Long createTime;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getPubKey() {
		return pubKey;
	}

	public void setPubKey(byte[] pubKey) {
		this.pubKey = pubKey;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Account [address=" + address + ", alias=" + alias + ", status=" + status + ", pubKey="
				+ Arrays.toString(pubKey) + ", createTime=" + createTime + "]";
	}
}
