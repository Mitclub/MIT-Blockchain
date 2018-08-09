package club.mit.p2p.model;

/**
 * @author mit.club
 *
 */
public class Block {
private String number;
private String blockHash;
private String author;
private String parentHash;
private String nonce;
private String miner;
private String gasLimit;
private String gasUsed;
private String timestamp;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getBlockHash() {
	return blockHash;
}
public void setBlockHash(String blockHash) {
	this.blockHash = blockHash;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getParentHash() {
	return parentHash;
}
public void setParentHash(String parentHash) {
	this.parentHash = parentHash;
}
public String getNonce() {
	return nonce;
}
public void setNonce(String nonce) {
	this.nonce = nonce;
}
public String getMiner() {
	return miner;
}
public void setMiner(String miner) {
	this.miner = miner;
}
public String getGasLimit() {
	return gasLimit;
}
public void setGasLimit(String gasLimit) {
	this.gasLimit = gasLimit;
}
public String getGasUsed() {
	return gasUsed;
}
public void setGasUsed(String gasUsed) {
	this.gasUsed = gasUsed;
}
public String getTimestamp() {
	return timestamp;
}
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}
}
